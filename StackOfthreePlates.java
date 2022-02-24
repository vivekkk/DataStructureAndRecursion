import java.util.ArrayList;

public class StackOfthreePlates {
    int capacity;
    ArrayList<Stack> arrayList;
    Stack s;

    public StackOfthreePlates(int cap) {
        this.capacity = cap;
        this.arrayList = new ArrayList<Stack>();
        s = new Stack();
        arrayList.add(s);
    }

    public void push(int value) {
        if (arrayList.get(arrayList.size() - 1).size < capacity) {
            arrayList.get(arrayList.size() - 1).push(value);

        } else {
            Stack s = new Stack();
            s.push(value);
            arrayList.add(s);

        }

    }

    public void pop() {
        int n = arrayList.size();
        n = n - 1;
        while (arrayList.get(n).size == 0 && n > 0) {
            n = n - 1;
        }
   // System.out.println("arraylist is "+ n);
   // System.out.println("arraylist"+ n + "size is "+ arrayList.get(n).size);
        arrayList.get(n).pop();

    }
    public void popAt(int a) {
        if(arrayList.get(a-1).size !=0)
        {
            arrayList.get(a-1).pop();
           // System.out.println("afterpop size" + arrayList.get(a-1).size);
            while( a<arrayList.size())
            {
            if(arrayList.get(a).size!=0 && arrayList.get(a-1).size<capacity+1)
            {
            arrayList.get(a-1).push(arrayList.get(a).tail.value);
            arrayList.get(a).removeTail();
             //System.out.println("test");
            }
            a=a+1;
        }
        }
    }

    public static void main(String arg[]) {
        StackOfthreePlates sthp = new StackOfthreePlates(2);
        sthp.push(8);
        sthp.push(9);
        sthp.push(10);
        sthp.push(11);
        sthp.push(12);
        sthp.push(13);
        sthp.push(14);
        sthp.push(15);
        sthp.push(16);
        sthp.push(17);
        //System.out.println("Size of the arraylist is " + sthp.arrayList.get(1).size);
        sthp.popAt(2);
        sthp.popAt(1);
        sthp.pop();
        sthp.pop();
        sthp.pop();
        sthp.pop();
        sthp.pop();
        sthp.pop();
     
        sthp.pop();
     
        sthp.pop();
     
        sthp.pop();
     
        sthp.pop();
     
        
     
     
     

     
    }

}

class Stack {
    Node head;
    Node tail;
    int size;

    void push(int value) {
        if (head == null) {
            Node newNode = new Node();
            newNode.value = value;
            head = newNode;
            newNode.next = null;
            tail = newNode;
            size = size + 1;
            System.out.println("Value pushed is " + value);
        } else {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = head;
            head = newNode;
            size = size + 1;
            System.out.println("Value pushed is " + value);
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else if (size == 1) {
            System.out.println("Value poped is " + head.value);
            head = null;
            tail = null;
            size = 0;
        }

        else {
            System.out.println("Value poped is " + head.value);
            head = head.next;
            size--;
        }

    }

    public void removeTail()
    {
        //int i=tail.value;
        Node currentNode=head;
        for(int i=1;i<size-2; i++)
        {
            currentNode=currentNode.next;

        }
        tail=currentNode;
        currentNode.next=null;
        size=size-1;
        
        
        

      
        
    }

}

class Node {
    int value;
    Node next;
}
