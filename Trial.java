import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.io.InputStreamReader;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
public class Trial {

  public static void main(String arg[]) {

    LinkedList1 ll = new LinkedList1();
    // ll.createLinkedList(5);
    ll.insertNode(1, 12);
    ll.deleteNode(12);
    ll.traverseLinkedList();
    ll.insertNode(2, 15);
    ll.insertNode(3, 16);
    ll.insertNode(4, 20);
    ll.insertNode(20, 25);
    ll.insertNode(0, 46);
    ll.insertNode(0, 55);
    ll.traverseLinkedList();
    System.out.println("----------------");
    System.out.println("Size= " + ll.size);
    ll.searchLinkedList(46);
    ll.deleteNode(55);
    ll.traverseLinkedList();
    ll.deleteNode(25);
    ll.traverseLinkedList();
    ll.deleteNodeWithLocation(4);
    System.out.println("----------------");
    ll.traverseLinkedList();
    ll.deleteNodeWithLocation(3);
    System.out.println("----------------");
    ll.traverseLinkedList();
    ll.deleteNodeWithLocation(2);
    System.out.println("----------------");
    ll.traverseLinkedList();
    ll.deleteNodeWithLocation(1);
    System.out.println("----------------");
    ll.traverseLinkedList();
    ll.deleteNodeWithLocation(1);
    System.out.println("----------------");
    ll.traverseLinkedList();
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

  public void deleteNodeWithLocation(int loc) {
    Node tempNode = head;
    if (head == null) {
      System.out.println("The linked list is empty, and cannot be deleted");
      return;
    } else if (loc == 1) {
      if (size == 1) {
        head = null;
        tail = head;
        size--;
        return;
      } else {
        head = head.next;
        size--;
        return;
      }

    } else if (loc >= size) {
      for (int i = 1; i < size - 1; i++) {
        tempNode = tempNode.next;

      }
      tempNode.next = null;
      tail = tempNode;
      size--;
      return;

    } else {
      for (int i = 1; i < loc - 1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
      return;

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

          } else if (i >= 0 && temp.next.value == value && temp.next.next != null) {
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
