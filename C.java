

interface IA {

	final int a=10;
		void showA();
	

}

class C implements IA

{
		int b=15;
		void showC()
	{
		System.out.println("B Method");
	}
	void showA()
	{
		System.out.println("A interface method implemented");
	}

	public static void main(String[] args) 
	{
		IA obj =new C();
	  System.out.println(obj.a);
      //System.out.println(obj.b); 
	  obj.showA();
      //obj.showC(); //issue in displaying method of B with refrence of A

     System.out.println("Now createing object of B with refrence of B only..."); 

	  C obj2=new C();
	
	  System.out.println(obj2.a);
      System.out.println(obj2.b); 
	  obj2.showA();
	  obj2.showC();
		
	}
}