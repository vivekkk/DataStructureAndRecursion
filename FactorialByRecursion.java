

import java.lang.Math;
public class FactorialByRecursion{

    public double  factorial(double n,double result)
    {  
        if(n<=1)
        { return result;}
        
         return factorial(n-1, result*n);  // this is tail recursion without backtracking;
                
    }

    public double  factorialheadrecursion(double n)
    {  
        if(n==1)
        { return 1;}
        
        
         return n*factorialheadrecursion(n-1);  // this is head recursion with backtracking;//this gives the stack overflow error below while the tail recursion does not.
                
    }
    public static void main(String arg[])
    {
    double i=100.2;
    FactorialByRecursion r=new FactorialByRecursion();
     double x= r.factorial(i,1.01);
    System.out.println(x);
    double k=100.2;
    double y=r.factorialheadrecursion(k);
    System.out.println(y);
    


        
    }
}