import java.util.*;
import java.lang.*;

/// complexity of the program is n square..
class Trial {

  void pairsFromAnArray(int[] a) 
  {
    for (int i=0; i< a.length; i++)
    {
     for (int j=0; j<a.length ; j++  )
     {
      System.out.println(a[i] + "," + a[j]);
     }
    }
  }

  public static void main(String arg[]) {
      int[] a={64,66,89,756};
    Trial t= new Trial();
    t.pairsFromAnArray(a);
  }
}
