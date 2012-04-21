
def sumn(f, n):
    return reduce(lambda x,y: x+y, map(f, range(1,n)))
    
print sumn(lambda x: x*x, 100)

