import java.util.HashMap;

public class NumberFactor {
    public String numFactorRecursion(int n, int fact, String str) // This program is created by me and is an example of
                                                                  // pure recursion
    {
        if (fact != 0) {
            str = str + String.valueOf(fact);
        }
        if (n == 0) {
            str = str + ", ";
            return str;
        } 
        if(n==1)
        {
           return str=str +"1"+ " ,";
        }
        else if(n==2)
        {
           return str=str+"11"+ " ,";
        }
        else if (n < 0) {
            return "";
        } else {

            return numFactorRecursion(n - 1, 1, str) + numFactorRecursion(n - 3, 3, str)
                    + numFactorRecursion(n - 4, 4, str);
        }
    }

    public int waysToGetNTopDown(int n) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(1,1);
        h.put(2,1);
        h.put(3,2);
       return nuberfactortopDown( n, h);
     
     }
     
     public int nuberfactortopDown(int n, HashMap<Integer,Integer> h)
     {
        if(n==1 || n==2 || n==0)
        {
            return 1;
        }
        else if(n==3)
        {
            return 2;
        }
          else if(!h.containsKey(n) && n>0 )
         {
             h.put(n,nuberfactortopDown(n-1, h)+nuberfactortopDown(n-3, h)+nuberfactortopDown(n-4, h));
         }
          return h.get(n);
     }

        public int NumberFactorBottomUp(int n, HashMap<Integer,Integer> h)
        {
        int count=3;
        h.put(0,1);
        h.put(1,1);
        h.put(2,1);
        h.put(3,2);
        while(count<=n )
        {
            
            if(!h.containsKey(count))
            {

                h.put(count,h.get(count-1<0?0:count-1)+h.get(count-3<0?0:count-3)+h.get(count-4<0?0:count-4));
            }
            count=count+1;
        }
        return h.get(n);
        }


    public void numFactorRecursionWithMemorization(int n,HashMap<Integer,String> h, String str)
    {
        if(n==1)
        {
            h.put(1, "1");
        }
        else if(n==2){
            h.put(2, "11");
            
        }
        else if(n==0)
        {
            h.put(0, "");
        }        
        else if(!h.containsKey(n))
        {
          
        }
        else if (n < 0) 
        {
           // return "";
        }
    }

    public static void main(String arg[]) {
        NumberFactor nfr = new NumberFactor();

       // System.out.println(nfr.numFactorRecursion(30, 0, ""));
        //System.out.println(nfr.waysToGetNTopDown(30));
        HashMap<Integer,Integer> h=new HashMap<>();
        System.out.println(nfr.NumberFactorBottomUp(30,h));
    }

}
