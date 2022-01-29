class A{

	int a=0;
		void showA()
	{
		System.out.println("A Method");
	}

}




class B  extends A

{
		int b=0;
		void showB()
	{
		System.out.println("B Method");
	}

	public static void main(String[] args) 
	{
		A obj =new B();
	  System.out.println(obj.a);
       //System.out.println(obj.b);
	   obj.showA();
	   //obj.showB();
		
	}
}

