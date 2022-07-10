import javax.swing.text.StyleConstants.CharacterConstants;

public class B extends A {
    int x=20;

  	
void print() 
{
int x=30;
System.out.println(x); 
System.out.println(this.x) ; 
System.out.println(super.x) ; 
}



public static void main(String args[]) 
{
 
  B b= new B();
  b.print();
 // b.show();
C c= b.thiReturnC();

c.show();
C.D cd=new A();
cd.hero();
test t3=new test<Integer>(){
  public Integer apply(A c)
  { 
    c=new A();
    Integer a=45;
     return a; 
  }

};


System.out.println(t3.apply(new A()));


  

}
    
}

class A implements C, C.D {
    int x=10;
    int y;

    A(int y)
    {
        this.y=y;
    }

    A()
    {}

    public C show()
    {
        System.out.println("This is show method");
         C c=new A();
         return c;
    }
    
    public C thiReturnC(){
     C c=new A();
     return c;
    
    }

    public void hero(){
        System.out.println("This is hero");
    }
}

interface C{

  interface D{

    void hero();
  }

    C show();
}

interface test<T> extends test2<A, T>
{
   
}
interface test2<A,T>
{
  public T apply(A s);
}