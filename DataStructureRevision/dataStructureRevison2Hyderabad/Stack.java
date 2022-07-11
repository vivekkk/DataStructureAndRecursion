public class Stack {

    int[] StackArray;
    int size;
    int lastIndex;

    public void createStack(int size) {
        this.size = size;
        StackArray = new int[size];
        this.lastIndex = -1;

    }

    public boolean isEmpty() {
        if(isDeleted())
        {
            System.out.println("the stack is deleted");
            return false;
        }
        else {
        if (lastIndex == -1) {
            System.out.println("The stack is empty");
            return true;
        } else
            return false;
    }
    }

    public boolean isFull() {
        if(isDeleted())
        {
            System.out.println("the stack is deleted");
            return false;
        }
        if (lastIndex == StackArray.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else
            return false;
    }

    public void push(int value) {
        if(isDeleted())
        {
            System.out.println("the stack is deleted");
            return;
        }
        if (isFull()) {
            System.out.println("cannot pust in stack as it is full");
        } else {
            StackArray[lastIndex + 1] = value;
            lastIndex = lastIndex + 1;
        }

    }
    public void peek()
    {
        if(isDeleted())
        {
            System.out.println("the stack is deleted");
            return ;
        }
       if(isEmpty())
       {
        System.out.println("Nothing to peek the stack is empty;");
       }
       else
       {
        System.out.println("peeked value is " + StackArray[lastIndex]);
       }

    }
    public void pop()
    {
        if(isDeleted())
        {
            System.out.println("the stack is deleted");
            return ;
        }
        if(isEmpty())
        {
         System.out.println("Nothing to pop the stack is empty;");
        }
        else
        {
            int x=StackArray[lastIndex];
         System.out.println("peeked value is " + x);
         lastIndex=lastIndex-1;
        }
    }

    public void deleteStack()
    {
        StackArray=null;
    }
    public boolean isDeleted()
    {
      if(StackArray==null)
      {
        return true;
      }
      else return false;
    }


    public static void main(String arg[])
    {
        Stack s= new Stack();
        s.createStack(6);
        s.pop();
        s.push(12);
        s.push(13);
        s.push(1);
        s.push(56);
        s.push(90);
        s.push(-100);
        s.push(88);
        s.peek();
        s.pop();
        s.peek();
        s.deleteStack();
        s.pop();
    }
}
