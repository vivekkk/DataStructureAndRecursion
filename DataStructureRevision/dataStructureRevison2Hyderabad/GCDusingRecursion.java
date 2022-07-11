class GCDusingRecursion   // using Ecludion algorithm
{
    public int gcdEcludianalgo(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        return gcdEcludianalgo(b,a%b);
    }


    public static void main(String arg[])
    {
        GCDusingRecursion gcd=new GCDusingRecursion();
       System.out.println(gcd.gcdEcludianalgo(48, 18)); 

    }
}
