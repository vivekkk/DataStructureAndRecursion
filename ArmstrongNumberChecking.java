class ArmstrongNumberChecking 
{
	{
		System.out.println("Program for checking if the given number is Armstorng");
	}
		
		
		public static void main(String[] args) 
	{
		
		int number=153;
		int armstrong=0;
		int a=number;
		while (number>0)
		{
		   
			int j=number%10;
		    armstrong=armstrong + j*j*j;
			number=number/10;
			
		}

		if (armstrong==a)
		{
         System.out.println("The number "+a + " is a Armstrong number");

		}
		else 
			System.out.println("The number "+a + " is a not Armstrong number");

		
	}
}
