import java.util.ArrayList;

public class QueueFromTwoStacks {

    Stack aStack;
    Stack bStack;
    ArrayList<Stack> al;
    int queueSize;

    public QueueFromTwoStacks(int queuesize) {
        aStack = new Stack(queuesize);
        bStack = new Stack(queuesize);
        al = new ArrayList<>();
        al.add(aStack);
        al.add(bStack);
    }

    public void enque(int value) {
        
        if (aStack.isFull() && bStack.isEmpty()) {
            while (!(bStack.isFull())) {
                bStack.push(aStack.pop());
            }
        }
        aStack.push(value);

    }

    public void dequeue() {
        if (!(bStack.isEmpty())) {
            int value=bStack.pop();
            System.out.println("Value dequeued is1 "+ value );

        } else if (bStack.isEmpty() && !(aStack.isEmpty())) {
            while (!(aStack.isEmpty())) {
                int a=aStack.pop();
                bStack.push(a);

            }
          int value= bStack.pop();
            System.out.println("Value dequeued is2 "+ value);

        }

        else{
            System.out.println("the queue is empty");
        }

    }
    public static void main(String vivek[])
    {
        QueueFromTwoStacks q=new QueueFromTwoStacks(4);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.dequeue();
        q.dequeue();
        // System.out.println("top of the a stack "+ q.aStack.topOftheStack);
        
        q.enque(5);
        q.enque(6);
        // System.out.println("top of the b stack "+ q.bStack.topOftheStack);
        // System.out.println("top of the a stack "+ q.aStack.topOftheStack);

        
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

    }

}

class Stack {
    int topOftheStack;
    int[] stackArray;

    public Stack(int size) {

        this.topOftheStack = -1;
        this.stackArray = new int[size];

    }

    public void push(int value) {
        if (topOftheStack == stackArray.length - 1) {
            System.out.println("The Stack is full");
        } else {
            stackArray[topOftheStack + 1] = value;
            topOftheStack++;
        }

    }

    public int pop() {

        
       if (topOftheStack != -1){

            int value = stackArray[topOftheStack];
            //System.out.println("value pop is " + stackArray[topOftheStack]);
            stackArray[topOftheStack]=0;
            topOftheStack--;
            return value;
        }
        else 
        return -1;
    }

    public boolean isFull() {
        if (topOftheStack == stackArray.length - 1) {
            return true;
        } else
            return false;

    }

    boolean isEmpty() {
        if (topOftheStack == -1) {
            return true;
        } else
            return false;

    }

}