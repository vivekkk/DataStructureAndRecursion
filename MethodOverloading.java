class MethodOverloading 
{

	void show()
	{
		System.out.println("Method with void return");
	}

	int show(int a)
	{
		System.out.println("method show with interger a= "+ a);
		return a;
	}
	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.show();
		m.show(10);

	}
}
