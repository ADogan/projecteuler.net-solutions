package Java_002;

public class main_002 {

	public static void main(String[] args)
	{
		int temp_prev_fib_nr = 0;
		int prev_fib_nr = 1;
		int fib_nr = 1;
		
		int maximum = 4000000;
		int sum = 0;
		
		while(fib_nr < maximum)
		{
			if(fib_nr % 2 == 0)
			{
				sum = sum + fib_nr;
			}
			temp_prev_fib_nr = fib_nr;
			fib_nr = fib_nr + prev_fib_nr;
			prev_fib_nr = temp_prev_fib_nr;
		}
		System.out.println(sum);
	}
}
