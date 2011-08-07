number = 1
result = 1
i = 1
loop do
  i = 20
  while i > 1 do
    result = number % i
    i = i - 1
    break if result > 0
  end
  break if result == 0
  number += 1
end
puts number

# this is a very slow solution! takes about 8-9 minutes
# can be made faster with the use of rational methods.