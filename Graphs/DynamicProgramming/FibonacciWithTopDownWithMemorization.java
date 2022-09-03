

import java.util.Date;
import java.util.HashMap;

class FibonacciWithTopDownWithMemorization
{


     public int fibnacciwithMemo(int n, HashMap<Integer,Integer> h)
     
     {

       if(n==0 || n==1)
       {
        return n;
       }
       else if(!h.containsKey(n))
       {
        h.put(n, fibnacciwithMemo(n-1, h)+ fibnacciwithMemo(n-2, h));
       }

       return h.get(n);

        
     }

     public int fibnacciwithTabulation(int n, HashMap<Integer,Integer> h)
     { 

         h.put(0, 0);
         h.put(1, 1);
         int count=2;
         while(count<=n)
         {
            if(!h.containsKey(count))
            {
                h.put(count, h.get(count-1)+h.get(count-2));         
            }
            count=count+1;

         }

         
         return h.get(n);
         


     }

     public static void main(String arg[])
     {
        FibonacciWithTopDownWithMemorization fwtm =new FibonacciWithTopDownWithMemorization();
        HashMap<Integer, Integer> hash=new HashMap<>();
        Date d= new Date();
        
     // System.out.println(fwtm.fibnacciwithMemo(15000, hash));
      System.out.print(d.toString());
        System.out.println(fwtm.fibnacciwithTabulation(10000000, hash));
        System.out.print(d.toString());
        // for(int i=2; i<hash.size(); i++)
        // {
        //  System.out.print(hash.get(i)+",");
        // }
     }

}