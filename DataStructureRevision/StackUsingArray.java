public class StackUsingArray{

    public Stack createStack(int size){
        Stack s=new Stack(size);
        return s;
    }

    public static void main (String arg[])
    {
     StackUsingArray sua=new StackUsingArray();
     Stack s=sua.createStack(4);
     s.pop();
     s.push(56);
     s.push(96);
     s.push(58);
     s.push(85);
     s.push(9);
     s.push(7);
     s.push(6);
     s.push(65);

     System.out.println(s.pop());
     System.out.println(s.pop());
  for(int a : s.stackArray)
  {
    System.out.println(a);
 }

    }




}

class Stack{
   int[] stackArray;
   int topOfTheIndex;
   int size;

   public Stack(int n)
   {
       this.size=n;
       this.stackArray=new int[n];
       this.topOfTheIndex=-1;
   }



public boolean isEmpty()
{
    if(topOfTheIndex==-1)
    {
        return true;
    }
    else return false;

}

public boolean isFull()
{
    if(topOfTheIndex==size-1)
    {
        return true;
    }
    else return false;
}

public void push(int value)
{
    if(isEmpty())
    {
        stackArray[0]=value;
        topOfTheIndex=topOfTheIndex+1;
    }
    else if(!isFull())
    {
        stackArray[topOfTheIndex+1]=value;
        topOfTheIndex=topOfTheIndex+1;
    }
    else{
        System.out.println("Cannot push The stack is full");
    }
}
public int pop()
{
    if(isEmpty())
    {
        System.out.println("cannot pop as stack is Empty");
        return -1;
    }
    else{

        int a=stackArray[topOfTheIndex];
      //  System.out.println(stackArray[topOfTheIndex]);
        stackArray[topOfTheIndex]=0;
        topOfTheIndex=topOfTheIndex-1;
        return a;
        
    }
}

}