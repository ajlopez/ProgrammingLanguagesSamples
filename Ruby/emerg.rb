
def emergency?
  return true
end

def in_case_of_emergency
  yield if emergency?
end

in_case_of_emergency do
  puts "Missile launch"
end