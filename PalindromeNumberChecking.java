class PalindromeNumberChecking 
{
	{
		System.out.println("Program for checking if the given number is palindrome");
	}
		
		
		public static void main(String[] args) 
	{

		
		int number=16461;
		int reverse=0;
		int a=number;
		while (number>0)
		{
		   
			int j=number%10;
		    reverse= reverse*10 +j;
			number=number/10;
			
		}

		if (a==reverse)
		{
         System.out.println("The number "+a + " is a Palindrone number");

		}
		else 
			System.out.println("The number "+a + " is a not Palindrone number");


		
	}
}
