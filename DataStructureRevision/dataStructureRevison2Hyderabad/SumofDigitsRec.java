class SumofDigitsRec{

    public int SumofDigits(int n)
    {
      if(n==0)
      {
          return n;
      }
      else 
      {
          return n%10+SumofDigits(n/10);
      }
    }

    public static void main (String arg[])
    {
        SumofDigitsRec sdr=new SumofDigitsRec();
        int i=sdr.SumofDigits(1234);
        System.out.println(i);

    }
}