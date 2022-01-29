class SumOfFactorsOfaGivenNumber  
{
	public static void main(String[] args) 
	{
		int number=100;
		int j=0;

        for (int i=number ;i>=1 ;i-- )
        {
			
			if (number%i==0)
			{
				j=j+i;
				
			 System.out.println(i);
	}
			}

       System.out.println("Sum of factors is " + j);
			
        }
		
	}

