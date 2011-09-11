sum = 0
# not_a_prime = false
# for i in 2..2000000
#  a = 2
#   while i > a
#     if (i % a) == 0
#       not_a_prime = true
#       break
#     end
#       a += 1
#   end
#   if not_a_prime == false
#     # print "#{i} is a prime \n"
#     sum += i
#   else
#     not_a_prime = false
#   end
#   puts "next i: #{i}"
# end
# ===============================================================================
# = above, my code to get prime numbers. slow to get all primes below 2.000.000 =
# ===============================================================================

n = 2000000
  primes = (0..n).to_a
  primes[0] = primes[1] = nil
  primes.each do |p|
    next unless p
    break if p * p > n
    (p*p).step(n, p)  do
      |m| 
      primes[m] = nil 
    end
  end
  # =======================================================================================================================================
  # = above, code to get primes from http://stackoverflow.com/questions/241691/sieve-of-eratosthenes-in-ruby with some of my edits        =
  # =======================================================================================================================================
primes.each do |number|
  if number != nil
    sum += number
  end
end

puts sum