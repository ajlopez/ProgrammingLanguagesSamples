
import sys

x = int(sys.argv[1])
result = 1

while x > 1:
    result *= x
    x-=1
    
print(result)
