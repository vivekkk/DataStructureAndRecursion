class SumOfDigitOfaGivenNumber 
{
	public static void main(String[] args) 
	{
		int number=14756;
		int j=0;
		System.out.println("Program to display sum of digits of a given number " + number);
       do
       {
		   int i=number%10;
			   System.out.println(i);
               j=j+i;
			   number=number/10;
       }
       while (number>0);

      System.out.println("Sum of digits of a given number =  " + j);
	}
}
