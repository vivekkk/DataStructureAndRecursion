class FactorsOfaGivenNumber 
{
	public static void main(String[] args) 
	{
	
		int number=100;

		System.out.println("Factors of a number "+ "number");

        for (int i=number ;i>=1 ;i-- )
        {
			
			if (number%i==0)
			{
         System.out.println( i);
			}

    			
        }

}
}
