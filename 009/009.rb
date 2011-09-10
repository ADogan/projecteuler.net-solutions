a=b=c=0
loop do
    a += 1
    b = a + 1
    while (a + b + b) < 1000
      a2 = (a * a)
      b2 = (b*b)
      c = Math.sqrt(a2 + b2)
      if (a + b + c) == 1000
        product = a * b * c
        puts product.to_i
        exit
      end
      b += 1
    end
end