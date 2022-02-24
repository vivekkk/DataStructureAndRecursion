public class StackImplementationByLinkedList {
public static void main(String arg[])
{
Stack s =new Stack();
s.peek();
s.push(87);
s.push(77);
s.push(67);
s.push(57);
s.delete();
s.push(47);
s.peek();
s.pop();
s.pop();
s.pop();
s.pop();
s.pop();
s.pop();
s.pop();
s.pop();
}

}

class Stack {

    Node head;

    // Node tail;
    public Stack() {
        head = null;
        System.out.println("Stack is created successfully");
    }

    public void push(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;

    }

    boolean isEmpty() {
        if (head == null) {

            return true;
        }
        else
        return false;
    }
    void pop()
    {
     if(isEmpty())
     {
         System.out.println("The Stack is emptly nothing to pop");
     }
     else{

        System.out.println(head.value);
        head=head.next;
     }

    }

    void peek()    {
        if(isEmpty())
        {
            System.out.println("The Stack is emptly nothing to pop");
        }
        else{
   
           System.out.println(head.value);
        }
   
       }

       void delete()
       {
           head=null;
           
       }
}

class Node {
    int value;
    Node next;

}
