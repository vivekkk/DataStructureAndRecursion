class PerfectNumberAtagivenInterval 
{
	public static void main(String[] args) 
	{
		
         
         
		 int intervalStart=100;
		 int intervalEnd=1000;

		 System.out.println("Program to write Perfect numbers at a given interval "+ intervalStart +" and " + intervalEnd );  

		for (int i=intervalStart;i<=intervalEnd ;i++ )
		{
			int k=0;

			for (int j=i-1;j<=i && j!=0 ;j-- )
			{
				if (i%j==0)
				{
					k=k+j;

				}

			}

		if (k==i)
		{
		System.out.println(i);

		}


		}
		
	}
}
