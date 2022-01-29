class FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to display the factorial of a given number");

		int number=5;
		int i=number;
		long j=1;
		while (i>1)
		{

			j=j*i;
			i--;
		
		}
      System.out.println("factorial= "+ j);
		
	}
}
