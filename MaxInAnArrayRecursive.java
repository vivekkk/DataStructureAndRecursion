import java.util.*;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
class Trial {

  int maxValueinArrayRecursive(int[] a, int n) {
    if (n==1)
    {
      return a[0];
    }
    
    return Math.max(a[n-1], maxValueinArrayRecursive(a, n-1)) ;
  }

  public static void main(String arg[]) {
      int[] a={64,66,89,756};
    Trial t= new Trial();
    int test=t.maxValueinArrayRecursive(a, 4);
    System.out.println(test);

  }
}
