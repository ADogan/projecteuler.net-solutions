x =0
largest = 0
for nr1 in 100..999
  for nr2 in 100..999
    result = (nr1 * nr2).to_s
    if result == result.reverse
      if result.to_i > largest
        largest = result.to_i
      end
      break
    end
  end
end
print largest