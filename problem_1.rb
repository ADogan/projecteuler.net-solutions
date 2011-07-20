x = 1
sum = 0
for x in 0..999
  if (x%3) == 0
    sum += x
  elsif x%5 == 0
    sum += x
  end 
end
puts sum