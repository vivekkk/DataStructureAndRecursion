import java.util.*;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
class Trial {
 static int y=0;
  public static String capitalizeWord(String str) {
    // TODO
    
    int n = str.length();
    // System.out.println(n);
    int k = 0;
    int j = 0;
    
    if(y==0)
    {
      
     int l =str.charAt(0) -32;
     str = Character.toString((char)l) + str.substring(1, n);
    }
    if (n > 0) {

      char test = str.charAt(0);
      if (n >= 2) {
        char test1 = str.charAt(1);
        if (str.charAt(0) == 32 && str.charAt(1) >= 97) {
          k = test;
          j = test1 - 32;
          y=y+1;
         // System.out.println((char)k);
          str = Character.toString((char)k) + Character.toString((char)j) + str.substring(2, n);
         // System.out.println(str);
        
        } 
        else {
          k = test;
          y=y+1;
  
        }

      }
      else {
        k = test;
        y=y+1;

      }

      return (char) k + capitalizeWord(str.substring(1, n));

    } else
      return "";
  }

  public static void main(String arg[]) {
    String t = Trial.capitalizeWord("hi friends i miss you all for the new year celebrations..");
    System.out.println(t);

  }
}
