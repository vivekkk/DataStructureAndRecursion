import java.util.*;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
class Trial {

  int[] pairsFromAnArray(int[] a) 
  {
   
    int[] atemp = new int [a.length];
    
   for(int i=0;i<a.length; i++)
   {
    atemp[i]=a[a.length-1-i];

   }
   return atemp;
  }

  public static void main(String arg[]) {
      int[] a={64,66,89,756, 83,44,78};
      int n=a.length;
    Trial t= new Trial();
    int b[]= new int[n];
    b=t.pairsFromAnArray(a);
  for(int i=0; i<b.length; i++)
  {
   System.out.println(b[i]);
  }
  
  }
}
