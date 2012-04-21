
def begin_transaction
  puts "Begin transaction"
end

def end_transaction
  puts "End transaction"
end

def within_a_transaction
  begin_transaction
  yield
  end_transaction
end

within_a_transaction do 
  puts "Doing something"
end