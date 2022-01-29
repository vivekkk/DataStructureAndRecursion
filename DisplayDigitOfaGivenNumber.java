class DisplayDigitOfaGivenNumber 
{
	public static void main(String[] args) 
	{
		int number=14567;
		System.out.println("Program to display digits of a given number " + number);
       do
       {
		   int i=number%10;
			   System.out.println(i);
			   number=number/10;
       }
       while (number>0);
	}
}
