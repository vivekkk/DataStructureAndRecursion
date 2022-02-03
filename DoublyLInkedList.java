import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.io.InputStreamReader;
import java.lang.*;

/// without implementing the runnable interface and directly invoking the run method
public class Trial {

    public static void main(String arg[]) {
        DoublyLL dl = new DoublyLL();
        dl.createDoublyLL(5);
        System.out.println("Size: " + dl.size);
        dl.insertInDoublyLL(2, 77);
        System.out.println("Size: " + dl.size);
        dl.insertInDoublyLL(8, 66);
        dl.insertInDoublyLL(8, 100);
        dl.insertInDoublyLL(8, 901);
        System.out.println("Size: " + dl.size);
        dl.insertInDoublyLL(1, 88);
        System.out.println("Size: " + dl.size);
        dl.traverseDLL();
        System.out.println("----------");
        // dl.reverseTraversalLL();
        dl.deleteEntireLL();
        dl.traverseDLL();
        // System.out.println("1-"+ head1.previous.value);
        // System.out.println("1-"+ head1.value);
        // System.out.println("2-"+ head1.next.value);
        // System.out.println("3-"+ head1.next.next.value);
        // System.out.println("4-"+ head1.next.next.next.value);
        // System.out.println("1"+ head1.value);
        // System.out.println("1"+ head1.value);

    }

}

class DoublyLL {
    int size;
    NodeD head;
    NodeD tail;

    public void deleteEntireLL() {
        if (head == null) {
            System.out.println("The linked list is already deleted");
        } else {
            NodeD tempNode = head;
            for (int i = 1; i <= size; i++) {
                tempNode.previous = null;
                tempNode = tempNode.next;

            }
            head = null;
            tail = null;

            System.out.println("Doubly linked list is deleted");
        }

    }

    public void deleteNode(int loc) {
        if (head == null) {
            System.out.println("LinkedList is empty no node cannot be deleted");
            return;
        } else if (loc < size) {
            if (loc == 1) {
                head = head.next;
                head.previous = null;
                size = size - 1;
            } else {
                NodeD tempNode = head;
                for (int i = 1; i < loc - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.next.previous = tempNode;
                size = size - 1;

            }

        } else if (loc >= size) {
            tail = tail.previous;
            tail.next = null;
            size = size - 1;
        }

    }

    public void searchNode(int value) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        } else {
            NodeD tempNode = head;
            for (int i = 1; i <= size; i++) {
                if (tempNode.value == value) {
                    System.out.println("Node found at location: " + i);
                    return;
                }
                tempNode = tempNode.next;

            }
            System.out.println("No node with value: " + value + "is found");
        }

    }

    public void traverseDLL() {
        if (head == null) {
            System.out.println("The linkkeddd list does not exit");
            return;
        }

        NodeD tempNodeD = head;

        for (int i = 0; i < size; i++) {
            System.out.print(tempNodeD.value);
            if (i < size - 1) {
                System.out.print("->");
            }
            tempNodeD = tempNodeD.next;

        }

    }

    public void reverseTraversalLL() {
        NodeD tempNode = tail;
        for (int i = size; i >= 1; i--) {
            System.out.print(tempNode.value);
            if (i > 1) {
                System.out.print("<-");
            }
            tempNode = tempNode.previous;

        }

    }

    public void createDoublyLL(int value) {
        if (head == null) {
            NodeD node = new NodeD();
            node.value = value;
            node.previous = null;
            node.next = null;
            head = node;
            tail = node;
            ++size;
            System.out.println("Sizefn: " + size);
            System.out.println("Doubly linked list created");

        }

    }

    public void insertInDoublyLL(int loc, int value) {
        if (head == null) {
            createDoublyLL(value);
            return;
        } else if (loc < size) {
            if (loc == 1) {
                NodeD node = new NodeD();
                node.value = value;
                head.previous = node;
                node.next = head;
                node.previous = null;

                head = node;
                size++;
                return;
            } else {
                NodeD tempNode = head;
                for (int i = 0; i < loc - 1; i++) {
                    tempNode = tempNode.next;
                }
                NodeD node = new NodeD();
                node.value = value;
                tempNode.next.previous = node;
                node.next = tempNode.next;
                tempNode.next = node;
                node.previous = tempNode;
                size++;
                return;

            }
        }

        else if (loc >= size) {
            NodeD node = new NodeD();
            node.value = value;
            tail.next = node;
            node.previous = tail;
            node.next = null;
            tail = node;
            size++;
            // System.out.println("Size: "+ size);
            return;
        }

    }

}

class NodeD {
    NodeD previous;
    NodeD next;
    int value;

}
