limit = 10001
counter = 0
x=z=2

prime = true
loop do
  while z < x && prime do
    if x % z == 0
      prime = false
      break
    end
    z += 1
  end
  z = 2
  if prime
    counter += 1
    puts counter    
    if counter == limit
      print x
      break
    end
  end
  prime = true
  x += 1
end
