class StrongNumberBetweenOneAndThousand
{
	int factorial(int a)
	{
		int j=1;
		while (a>0)
		{
			j=j*a;
			a--;
		}
		return j;

	}
	public static void main(String[] args) 
	{
	  StrongNumberBetweenOneAndThousand sn=new StrongNumberBetweenOneAndThousand();
	  int start=1;
	  int end=1000;
	  
	  for (int i=start;i<=end ;i++ )
	  {
	   int j=0;
	   int compare=i;
	   
	   while(compare>0)
		{		
		 int k=compare%10;
	   	 j=j+sn.factorial(k);
		 compare=compare/10;

		}

	  if (j==i)
	  {
		  System.out.println("The number "+ i +" is a Strong number");
	  }

	  else
      System.out.println("The number "+ i +" is not a Strong number");
		
	}
}
}


