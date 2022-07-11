public class PowerOfNumberRec {

    public int powerOfNumber(int base, int exp)
    {
        if(exp<=0)
        {
            return 1;
        }

        else
        return base* powerOfNumber(base, exp-1);

    }
    public static void main(String arg[])
    {

        PowerOfNumberRec pon=new PowerOfNumberRec();
       System.out.println(pon.powerOfNumber(54, 4)); 

    }
}

