import java.text.DecimalFormat;
import java.util.*;
class DemimalOfaNumber
{

    String DecimaltoBinary(Integer n)
    {
        if(n==1)
        {
        return (Integer.toString(1));
        }
        
       else{
         return (Integer.toString(n%2)) + (DecimaltoBinary((n/2)));  //int.toString() does not work on primitive data types it work on Integer.
         
       }

    }
 public static void main(String ar[])
 {
    DemimalOfaNumber d=new DemimalOfaNumber();
    String s=d.DecimaltoBinary(10);
    System.out.println(s);
}
}