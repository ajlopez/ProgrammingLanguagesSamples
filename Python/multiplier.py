def multiplier(factor):
  def multiplyByFactor(number):
    return number*factor
  return multiplyByFactor
  
multby2 = multiplier(2)
multby3 = multiplier(3)

print multby2(7)
print multby3(8)

