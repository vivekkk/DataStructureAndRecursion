class  PerfectNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Program to test if a given number is perfect or not");

		int num=496;
	
		int j=0;

		for (int i=num-1;i>=1 ;i-- )
		{
			if (num%i==0)
			{
              j=j+i;
            
			}
			
		}

		if (j==num)
		{
		System.out.println("The number " + num + " is perfect");

		}
		else
			 System.out.println("The number" + num + " is not perfect");

		
	}
}


