
class Fixnum

  def mytimes
    i = self
    
    while i > 0
      i = i - 1
      yield
    end
  end

end

4.mytimes { puts "Hello" }

