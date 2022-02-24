
import java.lang.reflect.GenericSignatureFormatError;
import java.util.EmptyStackException;
/*  
Problm: An animal shelter holds only dogs and cats, and operates on a strictly "first in, first out" 
basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, 
or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
They cannot select which specific animal they would like. Create the data structures to maintain this system and 
implement operations such as enqueue, dequeueAny, dequeueDog and dequeueCat. */

public class AnimalShelterQueueProblem {
  public static void main(String args[]) {
    Queue q = new Queue();
    q.enqueue(new Cat("catty"));
    q.enqueue(new Dog("Raja1"));
    q.enqueue(new Cat("Tom"));
    q.enqueue(new Cat("maxi"));
    q.enqueue(new Dog("Boxer"));
    q.enqueue(new Cat("sweetie1"));
    q.enqueue(new Cat("sweetie2"));
    q.enqueue(new Dog("Raja2"));
    q.enqueue(new Cat("Tom"));
    System.out.println(q.head.animal.getClass().getName());
    q.dequeueCat();
    q.dequeueCat();
    q.dequeueDog();
    q.dequeueDog();
    q.dequeueCat();
    q.dequeueDog();
    q.dequeue();
    q.dequeue();
    // q.dequeue();
    // q.dequeue();
   AnimalType a= new Cat("Cattttt");
   System.out.println(a.name);
   a.name="test";
   System.out.println(a.name);

  }
}

class Queue {
  Node head;
  Node tail;
  int size;

  void enqueue(AnimalType a) {
    if (head == null) {
      Node newNode = new Node();
      newNode.animal = a;
      newNode.next = null;
      head = newNode;
      tail = newNode;
      size = size + 1;
    } else {

      Node newNode = new Node();
      newNode.animal = a;
      Node currentNode = head;
      for (int i = 1; i < size; i++) {
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
      newNode.next = null;
      tail = newNode;
      size = size + 1;

    }

  }

  void dequeue() {
    if (head == null) {
      System.out.println("The Queue is empty.");
    }

    else if (size == 1) {
      System.out.println("Dequeue: " + head.animal.name);
      head = null;
      tail = null;
      size--;

    } else {
      System.out.println("Dequeue:" + head.animal.name);
      head = head.next;
      size--;

    }

  }

  public void dequeueCat() {

    if (size == 1 && head.animal.getClass().getName() == "Cat") {
      System.out.println("dequeued1:" + head.animal.name);
      head = null;
      tail = null;
      size = 0;
      return;
    } else {
      if (head.animal.getClass().getName() == "Cat") {
        System.out.println("dequeued2:" + head.animal.name);
        head = head.next;
        size--;
        return;
      } else {
        Node tempNode = new Node();
        tempNode = head;
        for (int i = 1; i < size - 1; i++) {
          if (tempNode.next.animal.getClass().getName() == "Cat") {
            break;
          } else {
            tempNode = tempNode.next;

          }
        }
        if (tempNode != head) {
          System.out.println("dequeued3:" + tempNode.next.animal.name);
          tempNode.next = tempNode.next.next;
          size--;
          return;
        } else if (tail.animal.getClass().getName() == "Cat") {
          System.out.println("dequeued4:" + tail.animal.name);
          Node tempNode2 = head;
          for (int i = 1; i < size - 1; i++) {
            tempNode2 = tempNode2.next;
          }

          tempNode2.next = null;
          tail = tempNode2;
        }

      }

    }
  }

  public void dequeueDog() {

    if (size == 1 && head.animal.getClass().getName() == "Dog") {
      System.out.println("dequeued1:" + head.animal.name);
      head = null;
      tail = null;
      size = 0;
      return;
    } else {
      if (head.animal.getClass().getName() == "Dog") {
        System.out.println("dequeued2:" + head.animal.name);
        head = head.next;
        size--;
        return;
      } else {
        Node tempNode = new Node();
        tempNode = head;
        for (int i = 1; i < size - 1; i++) {
          if (tempNode.next.animal.getClass().getName() == "Dog") {
            break;
          } else {
            tempNode = tempNode.next;

          }
        }
        if (tempNode != head) {
          System.out.println("dequeued3:" + tempNode.next.animal.name);
          tempNode.next = tempNode.next.next;
          size--;
          return;
        } else if (tail.animal.getClass().getName() == "Dog") {
          System.out.println("dequeued4:" + tail.animal.name);
          Node tempNode2 = head;
          for (int i = 1; i < size - 1; i++) {
            tempNode2 = tempNode2.next;
          }

          tempNode2.next = null;
          tail = tempNode2;
        }

      }

    }
  }

}

class Node {
  AnimalType animal;
  Node next;

}

abstract class AnimalType {

  protected String name;
  public AnimalType(String s)
  {
    this.name=s;
  }
  
  
  }
  
  class Dog extends AnimalType {
    public  Dog(String s)
    {
      super(s);
    }
  
  }
  
  class Cat extends AnimalType {
    public  Cat(String s)
    {
      super(s);
    }
  
  }