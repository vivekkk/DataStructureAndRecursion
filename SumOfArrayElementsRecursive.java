import java.util.*;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
class Trial {

  int sumAndProduct(int[] a, int n) {
   if (n==1)
   {
       return a[0];
   }
   else
   {
     return  ( a[n-1] + sumAndProduct(a, n-1)  )   ;
   }

    
  }

  public static void main(String arg[]) {
      int[] a={64,66,89,756};
    Trial t= new Trial();
    int test=t.sumAndProduct(a, 4);
    System.out.println(test);

  }
}
