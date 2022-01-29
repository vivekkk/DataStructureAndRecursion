class ProgramToDisplayPrimeNumberInaGivenInterval
{
	public static void main(String[] args) 
	{
		int start=40;
		int end=500;
		System.out.println("Program To Check prime numbers between 40 and 500 ");
      	for (int n=start;n<=end ;n++ )
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
