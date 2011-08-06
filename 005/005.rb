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
  number = number + 1
end
puts number
