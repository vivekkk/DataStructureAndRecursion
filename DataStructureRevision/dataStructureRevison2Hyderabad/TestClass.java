public class TestClass {

    static int k=0;
     public int powerof2(int n)
     {
        if(n<=0)
        return 1;
        else
        System.out.println("calling recursion"+ "2*"+(n-1));
        k=k+1;
        
        return 2* powerof2(n-1);

     }
    public static void main(String arg[])
    {

        TestClass t=new TestClass();
        
        System.out.println(t.powerof2(8));
        System.err.println(k);
    }
    
}
