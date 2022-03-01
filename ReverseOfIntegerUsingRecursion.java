import java.lang.Math;
public class ReverseOfIntegerUsingRecursion{

    public int  reverseInteger(int i,int result)
    {
        if(i==0) return result;         
       return reverseInteger(i/10,(result*10+i%10));  // no recursive stack  called;
                
    }
    public static void main(String arg[])
    {
    int i=12346;
    ReverseOfIntegerUsingRecursion r=new ReverseOfIntegerUsingRecursion();
    int x= r.reverseInteger(i,0);
    System.out.println(x);
    


        
    }
}