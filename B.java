class B extends A

{
		int b=15;
		void showB()
	{
		System.out.println("B Method");
	}

	public static void main(String[] args) 
	{
		A obj =new B();
	  System.out.println(obj.a);
     // System.out.println(obj.b); //issue in displaying instance variable of B with refrence of A
	  obj.showA();
	 // obj.showB(); //issue in displaying method of B with refrence of A

     System.out.println("Now createing object of B with refrence of B only..."); 

	  B obj2=new B();
	
	  System.out.println(obj2.a);
      System.out.println(obj2.b); 
	  obj2.showA();
	  obj2.showB();
		
	}
}

class A{

	int a=10;
		void showA()
	{
		System.out.println("A Method");
	}

}