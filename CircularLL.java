public class CircularLL {

  public static void main(String args[]) {
    CirculartLinkedList cl = new CirculartLinkedList();
    cl.createLinkedList(5);
    cl.insertLinkedList(2, 4);
    cl.insertLinkedList(3, 65);
    cl.insertLinkedList(20, 45);
    cl.traverseLinkedList();
    cl.createLinkedList(8);
    cl.insertLinkedList(1, 34);
    cl.traverseLinkedList();
    cl.deleteFromCyclicLinkedlist(1);
    System.out.println("-----------");
    cl.traverseLinkedList();
    cl.deleteFromCyclicLinkedlist(3);
    System.out.println("-----------");
    cl.traverseLinkedList();
   cl.deleteFromCyclicLinkedlist(20);
   System.out.println("-----------");
   cl.traverseLinkedList();
   cl.deleteFromCyclicLinkedlist(20);
   System.out.println("-----------");
   cl.traverseLinkedList();
   cl.deleteFromCyclicLinkedlist(20);
   System.out.println("-----------");
   cl.traverseLinkedList();
   cl.deleteFromCyclicLinkedlist(20);
   System.out.println("-----------");
    cl.traverseLinkedList();

  }

}

class CirculartLinkedList {
  Node head;
  Node tail;
  int size;

  public void traverseLinkedList() {
    Node tempNode = head;
    for (int i = 1; i <= size; i++) {
      System.out.print(tempNode.value);
      tempNode = tempNode.next;
      if (i < size)
        System.out.print("-->");

    }

  }

  public void deleteFromCyclicLinkedlist(int loc)
  {
    if(size==1 && loc>=1)
    {
      head.next=null;
      head=null;
      tail=null; 
      size=0;    

    }

    if (head==null)
    {
      System.out.print("the linked list is empty no deletion can be performed");
    }
    else
    { if(loc==1 & head.next!=null)
      {
        head=head.next;
        tail.next=head;
        size--;
        return;
      }
      else if(loc<size)
      {
        Node tempNode=head;
        for(int i=1;i<loc-1;i++)
        {
          tempNode=tempNode.next;

        }
        tempNode.next=tempNode.next.next;
        size--;
        return;
      }else if(loc>=size)
     {
      Node tempNode=head;
      for(int i=1;i<size-1;i++)
      {
        tempNode=tempNode.next;

      }
      tempNode.next=head;
      tail=tempNode;
      size--;
      return;

      }

    }

  }

  public void createLinkedList(int value) {
   if(head==null)
   {
    Node newNode = new Node(value);
    newNode.next = newNode;
    head = newNode;
    tail = newNode;
    size++;
    System.out.println("Circular linked list is created successfully...");
    return;
   }
   else {
    insertLinkedList(1,value);
    return;

   }

  }

  public void insertLinkedList(int loc, int value) {
    Node newNode = new Node(value);
    if (loc == 1 && head == null) {
      createLinkedList(value);
    } else if (loc == 1 && head != null) {
      newNode.next = head;
      head = newNode;
      tail.next=newNode;

      size++;
      System.out.println("Node is added successfully...");
      return;

    } else if (loc > 1 && loc < size && head != null) {
      Node tempNode = head;
      for (int i = 1; i < loc - 1; i++) {
        tempNode = tempNode.next;
       }

      newNode.next = tempNode.next;
      tempNode.next = newNode;
      size++;
      System.out.println("Node is added successfully...");
      return;

    } else if (loc >= size && head != null) {
      Node tempNode = head;
      for (int i = 1; i < size; i++) {
        tempNode = tempNode.next;
      }
      newNode.next = tempNode.next;
      tempNode.next = newNode;
      tail = newNode;
      size++;
      System.out.println("Node is added successfully...");
      return;

    }
    

  }

}

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }

}
