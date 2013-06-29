# all the imports
import sqlite3

# configuration
DATABASE = '/tmp/flaskr.db'

conn = sqlite3.connect(DATABASE)
c = conn.cursor()

# Create table
c.execute('''
drop table if exists entries''');
c.execute('''
create table entries (
  id integer primary key autoincrement,
  title text not null,
  text text not null
)''')

conn.commit()
conn.close()
    
 
