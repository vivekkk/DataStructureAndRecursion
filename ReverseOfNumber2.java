class ReverseOfNumber2
{
public static void main(String args[])
{
int num=895656665;
int rev=0;
for (int i=1;i>0 ;i=num%10 )
{
	int k=num%10;
	rev=rev*10+k;
	num=num/10;

}
System.out.println("Reverse of the number is "+ rev);


}
}