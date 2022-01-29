
import java.util.*;

class Demo
{
	public static void main(String args[])

	{
		Bank b = new Bank();
		b.balance=2000;
		Customer1 c1=new Customer1(b);
		c1.start();
        Customer2 c2=new Customer2(b);
		c2.start();

	}
	

}



class Bank
{
	float balance;
	synchronized void withdraw(float amount)
	{
		System.out.println("Withdraw is started....");
		
		if (balance < amount)
		{
        System.out.println("Balance is less waiting for deposit....");
			
		try{
			wait();
			
			}catch(Exception e)
			{ 
				System.err.println(e); 
		}
		}
		else 
		balance=balance - amount; 
		System.out.println("Withdraw of money is completed....");
	}


		synchronized void deposit(float amount)
	{
		System.out.println("deposit is started....");
			balance = balance + amount;
		System.out.println("deposit completed....");
			notify();

	}
}


class Customer1 extends Thread
{
	Bank c;
	Customer1(Bank b)
	{
		c=b;
		
	}

	public void run()
	{
		c.withdraw(6000);
	}

}

class Customer2 extends Thread
{
	Bank c;
	Customer2(Bank b)
	{
		c=b;
		
	}

	public void run()
	{
		c.deposit(100000);
	}


}



/*class Demo
{
public static void main(String... args)
{
Emp e1=new Emp(101, "bbb", 5000.00f);
Emp e2=new Emp(104, "aaa", 5500.00f);
Emp e3=new Emp(102, "eee", 6000.00f);
Emp e4=new Emp(103, "ccc", 4500.00f);
Emp e5=new Emp(105, "ddd", 6500.00f);
ArrayList<Emp> al=new ArrayList<>();
al.add(e1);
al.add(e2);
al.add(e3);
al.add(e4);
al.add(e5);
System.out.println(al);
Collections.sort(al, new EmpNoComparator());
System.out.println(al);
Collections.sort(al, new NameComparator());
System.out.println(al);
Collections.sort(al, new SalaryComparator());
System.out.println(al);
}
}

class Emp
{
int empNo;
String name;
float salary;
Emp(int empNo, String name, float salary)
{
this.empNo=empNo;
this.name=name;
this.salary=salary;
}
public String toString()
{
return empNo+"\t"+name+"\t"+salary;
}
}
class EmpNoComparator implements
Comparator<Emp> {
public int compare(Emp e1, Emp e2)
{
if(e1.empNo>e2.empNo)
return 1;
else if(e1.empNo<e2.empNo)
return -1;
else

return 0;
}
}
class NameComparator implements
Comparator<Emp> {
public int compare(Emp e1, Emp e2)
{
return e1.name.compareTo(e2.name);
}
}
class SalaryComparator implements
Comparator<Emp> {
public int compare(Emp e1, Emp e2)
{
if(e1.salary>e2.salary)
return 1;
else if(e1.salary<e2.salary)
return -1;
else
return 0;
}
}*/
