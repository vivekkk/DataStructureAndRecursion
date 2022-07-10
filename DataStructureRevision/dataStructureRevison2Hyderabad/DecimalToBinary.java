class DecimalToBinary
{
   public String DeciToBin(int n)
   {
       if(n==0)
       {
           return "0";
       }
       else if(n==1)
       {
           return "1";
       }

       else 
       {
           
           return  DeciToBin(n/2)+n%2  ;
       }


   }

    public static void main(String arg[])
    {
    DecimalToBinary d=new DecimalToBinary();
    System.out.println(d.DeciToBin(565656));  
    }
}
