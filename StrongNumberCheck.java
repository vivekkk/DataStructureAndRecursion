class StrongNumberCheck
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
	  StrongNumberCheck sn=new StrongNumberCheck();
	  int number=145;
	  int a=number;
	  int j=0;
      while(number>0)
		{
		  int i=number%10;
	   	 j=j+sn.factorial(i);
		  number=number/10;
		
		}
	   

	  if (j==a)
	  {
		  System.out.println("The number "+ j +" is a Strong number");
	  }

	  else
      System.out.println("The number "+ j +" is not a Strong number");
		
	}
}


