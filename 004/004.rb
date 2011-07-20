switch = 1
nr1 = 999
nr2 = 999

while nr1 > 99 
  result = nr1 * nr2
  puts result
  if result.to_s == result.to_s.reverse
    break
  end
  if switch == 1
    nr1 = nr1 - 1
    switch = 2
  else
    nr2 = nr2 - 1
    switch = 1
  end
end
  
puts result