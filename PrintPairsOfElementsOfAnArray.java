import java.util.*;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
class Trial {

  void pairsFromAnArray(int[] a) 
  {
    for (int i=0; i< a.length; i++)
    {
     for (int j=i+1; j<a.length ; j++  )
     {
      System.out.println(a[i] + "," + a[j]);

     }

    }

  }

  public static void main(String arg[]) {
      int[] a={64,66,89,756};
    Trial t= new Trial();
    t.pairsFromAnArray(a);
    //System.out.println(test);

  }
}
