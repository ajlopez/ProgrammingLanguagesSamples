import os
import flaskr
import unittest
import tempfile

class FlaskrTestCase(unittest.TestCase):

    def setUp(self):
        self.db_fd, flaskr.app.config['DATABASE'] = tempfile.mkstemp()
        flaskr.app.config['TESTING'] = True
        self.app = flaskr.app.test_client()
        flaskr.init_db()

    def login(self, username, password):
        return self.app.post('/login', data=dict(
            username=username,
            password=password
        ), follow_redirects=True)

    def logout(self):
        return self.app.get('/logout', follow_redirects=True)        
            
        def tearDown(self):
            os.close(self.db_fd)
            os.unlink(flaskr.app.config['DATABASE'])
        
    def test_empty_db(self):
        rv = self.app.get('/')
        data = rv.data.decode('ascii')
        assert('No entries here so far' in data)
        
    def test_login_logout(self):
        rv = self.login('admin', 'default')
        data = rv.data.decode('ascii')
        assert('You were logged in' in data)
        rv = self.logout()
        data = rv.data.decode('ascii')
        assert('You were logged out' in data)
        rv = self.login('adminx', 'default')
        data = rv.data.decode('ascii')
        assert('Invalid username' in data)
        rv = self.login('admin', 'defaultx')
        data = rv.data.decode('ascii')
        assert('Invalid password' in data)

    def test_messages(self):
        self.login('admin', 'default')
        rv = self.app.post('/add', data=dict(
            title='<Hello>',
            text='<strong>HTML</strong> allowed here'
        ), follow_redirects=True)
        data = rv.data.decode('ascii')
        assert('No entries here so far' not in data)
        assert('&lt;Hello&gt;' in data)
        assert('<strong>HTML</strong> allowed here' in data)
        
if __name__ == '__main__':
    unittest.main()