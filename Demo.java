
//Recursion with functional interface and Anonymous class..
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.lang.Thread;
import java.lang.Runnable;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo {
    public static void main(String vivek[]) {
      //  int[] intArray = new int[8];
 
       Function<Integer,Integer> factorialCalc  = new Function<Integer,Integer>(){
        @Override
        public Integer apply(Integer a) 
        {
          if (a<1)
          {
              return 1;
          }
             if (a==0 || a==1)
          {
              return 1;
          }
          else
          {
             
              return a*this.apply(a-1);
          }
          
         }

       };
       int n=6;
       int factorialvaue=factorialCalc.apply(n);
       System.out.println(factorialvaue);
  
        }
}
