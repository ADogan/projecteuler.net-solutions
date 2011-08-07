package Java_001;

public class main_001 {
		public static void main(String[] args)
		{
			int sum;
			sum = 0;
			
			int i;
			i = 0;
			while(i < 1000)
			{
				if(i%3 == 0)
				{
					sum = sum + i;
				}
				else if(i%5 == 0)
				{
					sum = sum + i;
				}
				i++;
			}
			System.out.print(sum);
		}

}
