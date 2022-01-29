class ProgramToCheckGivenNumberPrime 
{
	public static void main(String[] args) 
	{
		System.out.println("Program To Check Given Number is Prime ");

		int k=72;
		int j=0;
		for (int i=2;i<=k-1 ;i++ )
		{
			if (k%i==0)
			{
				 
             j=j+i;
			}
	 		
			 
		}

		if (j>0)
		{
		System.out.println("The number "+ k +" is not prime" );
			
		}
		else
		System.out.println("The number "+ k +" is prime" );

		
	}
}
