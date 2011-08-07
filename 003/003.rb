number = 600851475143
divide_by_number = 2

while number >= divide_by_number
  
  rest_of_division = number % divide_by_number
  if rest_of_division == 0
    number = number / divide_by_number
  else
    divide_by_number += 1
  end
end
 #the largest primary factor is the last in the calculation afaik so just print the last primary factor
 #possible to put them in an array and then check for the largest number
print divide_by_number