public class LinkedListMethods{

    public static void main(String arg[])
    {
        LinkedList l=new LinkedList();
        l.insertionLL("vivek");
        l.insertionLL("neha");
        l.insertionLL("Nav");
        l.traverseLinkedList();
       
    }

}

class LinkedList{
   Node head;
   Node tail;
   int size;



   public void insertionLL(String value)
   {
       if(head==null)
       {
           Node newNode=new Node();
           newNode.value=value;
           newNode.next=null;
           head=newNode;
           tail=newNode;
           size=size+1;
       }
       else {
           Node newNode=new Node();
           newNode.value=value;
           newNode.next=head;
           head=newNode;
           size=size+1;
       }
   }

   public void traverseLinkedList()
   {
       if (head==null)
       {
           System.out.println("Linked list is empty");
       }
       else
       {
           Node currentNode=head;
           for(int i=1; i<=size; i++)
           {
               
               System.out.println(currentNode.value);
               currentNode=currentNode.next;

           }
       }
   }

}

class Node{
   String value;
   Node next;

}