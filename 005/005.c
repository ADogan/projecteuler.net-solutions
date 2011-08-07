int main(void)
{
	int number = 1;
	int result = 1;
	int i = 1;
	
	while(result != 0 )
	{	
		number++;
		i = 20;
		while( i > 1 )
		{
			result = number % i;
			i--;
			if(result > 0)
			{
				break;
			}
		}
	}
	printf("%d", number);
	return 1;
}