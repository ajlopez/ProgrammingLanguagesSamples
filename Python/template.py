
from string import Template

template = Template("ten value is $ten")
dict = {}
dict['ten'] = 10

print template.substitute(dict)

