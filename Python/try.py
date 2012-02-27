
s = input("enter an integer: ")

try:
    n = int(s)
except ValueError as err:
    print(err)
    
    