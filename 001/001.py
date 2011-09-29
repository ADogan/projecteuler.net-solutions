x = 1
SUM = 0
while x < 1000:
	if x % 3 == 0 or x % 5 == 0:
		SUM += x
	x = x + 1
print SUM
    