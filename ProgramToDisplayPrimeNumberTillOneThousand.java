class ProgramToDisplayPrimeNumberTillOneThousand
{
	public static void main(String[] args) 
	{
		System.out.println("Program To Check prime numbers between 1 and 1000 ");
      
		for (int n=1;n<=1000 ;n++ )
		{
		int j=0;
		
		for (int i=n-1;i>1 ;i--)
		{
			if (n%i==0)
			{
				 
             j=j+i;
		}
 		}
			 if (j==0)
			 {
			  System.out.println(n);
			 
			 }
		
		}
		
	}
}
