r1 = 1
r2 = 1
count = 0

for i in 0..500
  r1 = r1 + r2
  if r1 > 4000000
    # puts r1
    break
  end
  if r1%2 == 0
    count += r1
  end
      
  r2 = r2 + r1
  if r2 > 4000000
    # puts r2
    break
  end
  if r2%2 == 0
    count += r2
  end
end

puts count