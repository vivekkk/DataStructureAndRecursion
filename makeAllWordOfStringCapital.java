import java.util.*;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
class Trial {

    public static String capitalizeWord(String str){
        //   TODO
        
        int n= str.length();
        //System.out.println(n);
        if (n>0)
        {
        int k=0;
        char test=str.charAt(0);
        if (test >= 97 && test<=122)
        {
            k = test -32;
        }
              
        else{
        k=test;
    
        }
      
        return (char)k + capitalizeWord(str.substring(1,n));
           
        
      }
      else 
      return "";  
    }
    public static void main(String arg[]) {
       String t= Trial.capitalizeWord("i love you my darling, i miss you for all my   life..");
       System.out.println(t);

       

}
}
