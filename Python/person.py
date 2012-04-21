__metaclass__ = type # Make sure we get new style classes

class Person:
  def setName(self, name):
    self.name = name
    
  def getName(self):
    return self.name

  def greet(self):
    print "Hello, world! I'm %s." % self.name
    
    