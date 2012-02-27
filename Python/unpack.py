
def mult(*args):
    result = 1
    for arg in args:
        result *= arg
        
    return result
    
print(mult(1,2,3,4))

def sumpowers(*args, power=1):
    result = 1
    for arg in args:
        result *= arg ** power
        
    return result

print(sumpowers(1,2,3,4))

print(sumpowers(1,2,3,4,power=2))

