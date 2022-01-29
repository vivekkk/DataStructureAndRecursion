class ReverseOfNumber 
{
	public static void main(String[] args) 
	{

		int number=89561;
		int reverse=0;
		while (number>0)
		{
			int j=number%10;
			number=number/10;
			reverse=reverse*10 + j;
		}
		System.out.println(reverse);
	}
}


