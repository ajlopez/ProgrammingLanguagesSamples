
print [x*x for x in range(10)]

print [[x, y] for x in range(1, 3) for y in range(1, 3)]

def triples(n):
    return [[a,b,c] for a in range(1,n) for b in range(1,n) for c in range(1,n) if a*a + b*b == c*c]
    
print triples(20)

