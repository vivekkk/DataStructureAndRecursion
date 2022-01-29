class PerfectNumberTillOneThousand 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Program to write Perfect numbers till one thousand");    

		for (int i=1;i<=1000 ;i++ )
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

