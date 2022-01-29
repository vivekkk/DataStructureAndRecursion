import java.util.*;

 class Trial {
    public int productofArray(int A[], int N) 
    { 
    
        if(N<0 || N==0)
        {
            return 1;
        }
       
        else 
        {
            System.out.println(A[N-1]);
             return A[N-1] * productofArray(A, N-1);
        }
    } 

    public static void main(String ar[])
    {
Trial t=new Trial();
int[] z={1,2,3,4,5,6};
int x=t.productofArray(z, 6);
System.out.println(x);

}

}