
public class QueueImplementationWithLinkedList {

    public static void main(String arg[]) {
       // LinkedList l=new LinkedList();
        Queue q=new Queue();
        
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.peek();
        q.dequeue();
         q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

    }

}

class Queue {
    LinkedList l;

    public Queue() {
        l=new LinkedList();

        System.out.println("Queue Created" );

    }

    void enqueue(int value) {
        
        Node newNode = new Node();
        newNode.value = value;
        if (l.head == null) {
            newNode.next = null;
            l.head = newNode;
            l.tail = newNode;
        } else {
            l.tail.next=newNode;
            newNode.next=null;
            l.tail=newNode;
        }

    }

    void dequeue()
    {
        if(l.head==null)
        {
            System.out.println("The queue is empty");
        }
        else
        {
        System.out.println(l.head.value);
        l.head=l.head.next;
        }
    }

    void peek()
    {
        if(l.head==null)
        {
            System.out.println("The queue is empty");
        }
        else
        {
        System.out.println(l.head.value);
        
        }
    }
}

class LinkedList {

    Node head;
    Node tail;

   public LinkedList()
    {
        this.head=null;
        this.tail=null;
    }

}


class Node {
    Node next;
    int value;

}
