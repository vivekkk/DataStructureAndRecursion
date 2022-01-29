class ArmstrongNumberInInterval
{

		
		public static void main(String[] args) 
	{
		
		int start=1;
		int end = 1000;
		System.out.println("Program for checking Armstrong number in given interval " + start + " and "+end);
		for (int i=start;i<=end ;i++ )
		{
		
		int armstrong=0;
		int a=i;
		while (a>0)
		{	
		   
			int j=a%10;
		    armstrong=armstrong + j*j*j;
			a=a/10;		
		}

		if (i==armstrong)
		{
         System.out.println("The number "+ i + " is a Armstrong number");

		}
		

		}

		
	}
}
