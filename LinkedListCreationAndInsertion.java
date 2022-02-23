import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.InsetsUIResource;

import java.io.InputStreamReader;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
public class LinkedListCreationAndInsertion {

  public static void main(String arg[]) {

    LinkedList1 ll = new LinkedList1();
    // ll.createLinkedList(5);
    ll.insertNode(1, 3);
    ll.insertNode(2, 5);
    ll.insertNode(3, 8);
    ll.insertNode(4, 5);
    ll.insertNode(20, 10);
    ll.insertNode(20, 2);
    ll.insertNode(20, 1);
    // ll.traverseLinkedList();
    System.out.println("----------------");
    System.out.println("Size= " + ll.size);
    Questions q = new Questions();
    // ll.traverseLinkedList();
    System.out.println("\n");
    // q.nthFromLast(ll, 1);
    ll.traverseLinkedList();
    System.out.println("Main LL address:" + ll);
    System.out.println("Main LL head address:" + ll.head);
    // q.partitionNodes(ll, 5).traverseLinkedList();;
    q.partitionNodesSecondImplementation(ll, 5).traverseLinkedList();
    /*
     * System.out.println("\n");
     * LinkedList1 l3 = new LinkedList1();
     * l3.insertNode(1, 7);
     * l3.insertNode(2, 1);
     * l3.insertNode(3, 6);
     * l3.traverseLinkedList();
     * System.out.println("\n");
     * LinkedList1 l4 = new LinkedList1();
     * l4.insertNode(1, 5);
     * l4.insertNode(2, 9);
     * l4.insertNode(3, 2);
     * l4.traverseLinkedList();
     * Questions q2=new Questions();
     * System.out.println("\n");
     * q2.sumList(l3, l4).traverseLinkedList();;
     */

    // ll.searchLinkedList(46);
    // ll.deleteNode(16);
    // ll.traverseLinkedList();
    // ll.deleteNode(25);
    // ll.traverseLinkedList();
  }

}

class Questions {
  public void nthFromLast(LinkedList1 ll, int n) {
    Node currentNode = ll.head;

    for (int i = 0; i < ll.size - n; i++) {
      currentNode = currentNode.next;

    }
    System.out.println(currentNode.value);

  }

  public LinkedList1 partitionNodes(LinkedList1 l3, int value) {

    LinkedList1 l2 = new LinkedList1();

    // l2.head=l3.head;
    // l2.head.next=null;
    l2.head = null; // l2FirstNode;
    l2.tail = null; // l2FirstNode;
    // FirstNode.next=null;
    l2.size = 0;
    // System.out.println("*****Traversing the linked list*******");
    l3.traverseLinkedList();
    // System.out.println("Value ll head :" + l3.head.value);
    // System.out.println("Value ll tail :" + l3.tail.next);

    Node currentNode = l3.head;
    // Node previousNode=null;
    for (int i = 0; i < l3.size; i++) {
      if (currentNode.value < value) {
        Node insertBegin = new Node();
        insertBegin.value = currentNode.value;
        insertBegin.next = l2.head;
        l2.head = insertBegin;
        l2.size = l2.size + 1;

      } else {
        Node l2CurrentNode = l2.head;
        Node insetLast = new Node();
        insetLast.value = currentNode.value;
        if (l2.size == 1) {
          l2.head.next = insetLast;
          insetLast.next = null;
          l2.tail = insetLast;
          l2.size++;

        } else {
          for (int j = 0; j < l2.size - 1; j++) {
            l2CurrentNode = l2CurrentNode.next;
          }
          l2CurrentNode.next = insetLast;
          insetLast.next = null;
          l2.tail = insetLast;
          l2.size++;
        }

      }
      System.out.println("Value of current node is :" + currentNode.value);
      currentNode = currentNode.next;

    }

    return l2;
  }

  public LinkedList1 partitionNodesSecondImplementation(LinkedList1 l3, int value) { // updating the same linked list.

    Node newFirstNode = new Node();
    newFirstNode = l3.head.next;
    l3.tail = l3.head;
    l3.head.next = null;
    l3.size = 1;
    l3.traverseLinkedList();
    System.out
        .println(newFirstNode.value + " " + " " + newFirstNode.next.value + " " + " " + newFirstNode.next.next.value);

    do {

      if (newFirstNode.value < value) {
        Node newNode = new Node();
        newNode.value = newFirstNode.value;
        newNode.next = l3.head;
        l3.head = newNode;
        l3.size++;

      } else {
        Node newNode = new Node();
        newNode.value = newFirstNode.value;
        l3.tail.next = newNode;
        l3.tail = newNode;
        l3.size++;
        ;
      }
      newFirstNode = newFirstNode.next;

      // System.out.print("Pgm running");

    } while (newFirstNode != null);

    return l3;

  }

  LinkedList1 sumList(LinkedList1 l3, LinkedList1 l4) {
    Node ll3curreNode = l3.head;
    Node ll4curreNode = l4.head;
    String s3 = "";
    String s4 = "";

    for (int i = 0; i < l3.size; i++) {
      s3 = ll3curreNode.value + s3;
      ll3curreNode = ll3curreNode.next;
    }
    System.out.println(s3);
    System.out.println("\n");
    for (int i = 0; i < l4.size; i++) {
      s4 = ll4curreNode.value + s4;
      ll4curreNode = ll4curreNode.next;
    }
    System.out.println("\n");
    System.out.println(s4);

    int sum = Integer.parseInt(s3) + Integer.parseInt(s4);
    s3 = String.valueOf(sum);
    LinkedList1 l1 = new LinkedList1();
    for (int i = 0; sum % 10 != 0; i++) {
      l1.insertNode(i + 1, sum % 10);
      sum = sum / 10;
    }

    return l1;

  }
}

class LinkedList1 {
  public Node head;
  public Node tail;
  public int size;

  public void searchLinkedList(int value) {
    if (head == null) {
      System.out.println("the linked list is empty could not find any node with value " + value);
      return;
    } else {
      Node temp = head;
      for (int i = 0; i < size; i++) {
        if (temp.value == value) {
          i = i + 1;
          System.out.println("Node found at position " + i + " with value of " + value);
          return;
        }
        temp = temp.next;

      }
      System.out.println("The value does not exist in the LinkedList");

    }

  }

  public void deleteNode(int value) {
    if (head == null) {
      System.out.println("There is no node in the LinkeList to be deleted");
      return;
    } else {
      Node temp = head;
      if (size == 1 && temp.value == value) {
        head = null;
        tail = null;
        size = size - 1;
        System.out.println("Node with value: " + value + " is succesfully deleted");
        return;

      } else if (size > 1) {
        for (int i = 0; i < size; i++) {
          if (i == 0 && temp.value == value) {
            head = temp.next;
            size = size - 1;
            System.out.println("Node with value: " + value + " is succesfully deleted");
            return;

          } else if (i > 0 && temp.next.value == value && temp.next.next != null)

          {
            temp.next = temp.next.next;
            size = size - 1;
            System.out.println("Node with value: " + value + " is succesfully deleted");
            return;

          } else if (i > 0 && temp.next.value == value && temp.next.next == null) {
            temp.next = temp.next.next;
            tail = temp;
            size = size - 1;
            System.out.println("Node with value: " + value + " is succesfully deleted");
            return;
          }

          temp = temp.next;

        }

      }

    }

  }

  public void createLinkedList(int value) {

    Node firstNode = new Node(value);
    // System.out.println(firstNode);
    firstNode.next = null;
    head = firstNode;
    tail = firstNode;
    size = size + 1;
    return;
  }

  public void traverseLinkedList() {
    if (head == null) {
      System.out.print("Linked list is empty: there are no elements in Linked List");
    } else {
      Node tempNode;
      tempNode = head;
      for (int i = 0; i < size; i++) {
        System.out.print(tempNode.value);
        tempNode = tempNode.next;

        if (i < size - 1) {
          System.out.print(" -> ");
        }

      }

    }
  }

  public void insertNode(int position, int nodeValue) {
    Node newnode = new Node(nodeValue);
    if (head == null) {
      createLinkedList(nodeValue);
      return;

    } else if (position == 0 && head != null) {
      newnode.next = head;
      head = newnode;
      size = size + 1;
    } else if (position > 0 && position < size) {
      Node tempNode = new Node();
      tempNode = head;
      for (int i = 0; i < position - 1; i++) {
        tempNode = tempNode.next;

      }
      newnode.next = tempNode.next;
      tempNode.next = newnode;
      size = size + 1;
      return;
    } else {
      Node tempNode = new Node();
      tempNode = head;
      for (int i = 0; i < size - 1; i++) {
        tempNode = tempNode.next;

      }
      tempNode.next = newnode;
      newnode.next = null;
      tail = newnode;
      size = size + 1;
      return;

    }

  }

}

class Node {

  public Node next;
  public int value;

  public Node(int value) {
    this.value = value;

  }

  public Node() {

  }

}
