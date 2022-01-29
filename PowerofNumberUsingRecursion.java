import java.util.*;
import java.util.function.Function;

class PowerofNumberUsingRecursion {
    public int power(int number, int n)
         {
          if (n==0)
          {
              return 1;
          }
          else
          {
            return number * power(number, n-1);
          }

         }
    public static void main(String arg[])
    {
        PowerofNumberUsingRecursion p=new PowerofNumberUsingRecursion();
        int a= p.power(56,3);
        System.out.println(a);
    }

}
