nnl = 100
 # ====================================================
 # = squares of the first one hundred natural numbers =
 # ====================================================
 sum1 = 0
  i = 0
 loop do
    i = i+1
   sum1 = sum1 + (i * i)
   break if i == nnl
 end
   
# ==================================================================
# = the square of the sum of the first one hundred natural numbers =
# ==================================================================
sum2 = 0
i = 0
loop do 
  i = i +1
  sum2 = sum2 + i
  break if i == nnl
end
sum2 = sum2 * sum2
puts sum2 - sum1
