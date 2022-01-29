class DisplayReverseOfaGivenNumber
{
	public static void main(String[] args) 
	{
		int number=14756;
		int j=0;
		int z=0;
		System.out.println("Program to display the reverse of a given number " + number);
		int k=number;
       do
       {
		   
		   int i=k%10;
			   System.out.println(i);
               k=k/10;
			   j++;
       }
       while (k>0);
	   

	   for (int i=j ;i>=1 ;i-- )
	   {
		  int s=number%10;
		  number=number/10;
         
		 double power=Math.pow(10, i-1);
		 int b=(int)power;
         z= z + s*b;
		 

	   }
	   System.out.println("Number of digits= "+ z);

      
	}
}
