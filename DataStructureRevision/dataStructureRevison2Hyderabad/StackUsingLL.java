public class StackUsingLL {

    LinkedListclass l;
    int size;
    int lastIndex;

    public StackUsingLL(int size) {
        this.l = new LinkedListclass();
        this.size = size;
        lastIndex = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        } else {
            l.insertionAtEndinLL(value);
            lastIndex = lastIndex + 1;
        }
    }

    public boolean isEmpty() {
        if (lastIndex == -1) {
            return true;
        } else
            return false;
    }

    public boolean isFull() {
        if (lastIndex == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        l.displayLastElementFromLL();
    }

    public void pop() {
        l.deletLastElementFromLL();
        lastIndex = lastIndex - 1;
    }

    public void displayLinkedlist() {
        l.traverseLinkedList(l);
    }

    public static void main(String arg[]) {
        StackUsingLL stack = new StackUsingLL(3);
        stack.push(12);
        stack.push(14);
        stack.push(15);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }

}

class LinkedListclass {
    Node head;
    Node tail;

    public void createLinkedList() {

        this.head = null;
        this.tail = null;

        System.out.println("Linked list created successfully");
    }

    public void insertionAtEndinLL(int value) {
        if (this.head == null) {
            Node firstNode = new Node();
            firstNode.value = value;
            firstNode.next = null;
            this.head = firstNode;
            this.tail = firstNode;
            System.out.println("Linked list created successfully with first Node");

        } else {
            Node newNode = new Node();
            newNode.value = value;
            tail.next = newNode;
            tail = newNode;

            System.out.println("Linked list created successfully new node inserted near tail");

        }

        // System.out.println("Linked list created successfully");
    }

    public void insertionAtBeginingLL(int value) {
        if (this.head == null) {
            Node firstNode = new Node();
            firstNode.value = value;
            firstNode.next = null;
            this.head = firstNode;
            this.tail = firstNode;
            System.out.println("Linked list created successfully with first Node");

        } else {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = head;
            head = newNode;
            System.out.println("Linked list created successfully new node inserted near tail");

        }

        // System.out.println("Linked list created successfully");
    }

    public void insertInBetween(int position, int value) {
        if (position == 1) {
            Node tempNode = new Node();
            tempNode.value = value;
            tempNode.next = head;
            head = tempNode;

        } else {
            Node tempNode = new Node();
            int count = 0;
            for (tempNode = head; tempNode != null; tempNode = tempNode.next) {
                count = count + 1;
                if (count == position - 1) {
                    Node tempNode2 = new Node();
                    tempNode2.value = value;
                    if (tempNode.next == null) {
                        tempNode.next = tempNode2;
                        tempNode2.next = null;
                        tail = tempNode;

                    } else {

                        tempNode2.next = tempNode.next;
                        tempNode.next = tempNode2;
                    }
                }
            }
        }

    }

    public void traverseLinkedList(LinkedListclass l) {
        if (l.head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node tempNode = l.head;

            for (tempNode = l.head; tempNode != null; tempNode = tempNode.next) {
                System.out.print(tempNode.value + ",");
            }
            /*
             * do {
             * System.out.print(tempNode.value + ",");
             * tempNode = tempNode.next;
             * 
             * } while (tempNode != null );
             */
        }
    }

    public void displayLastElementFromLL() throws NullPointerException {
        if (head == null) {
            System.out.println("The linked list is empty");
        } else {
            if (head.next == null) {
                System.out.println("The value peeked is " + head.value);
            } else {
                Node tempNode = new Node();
                for (tempNode = head; tempNode != null; tempNode = tempNode.next) {
                    if (tempNode.next == null) {
                        System.out.println("The value peeked is " + tempNode.value);
                    }

                }
            }

        }
    }

    public void deletLastElementFromLL() {
        Node n = new Node();
        if (head == null) {
            System.out.println("The linked list is empty nothing can be deleted");
        } else {

            if (head.next == null) {
                System.out.println("The value pop is:: " + head.value);
                head = null;
                tail = null;
            } else {

                // int count = 0;

                Node tempNode = new Node();
                for (tempNode = head; tempNode.next != null; tempNode = tempNode.next) {
                    if (tempNode.next.next == null) {
                        n = tempNode;
                        System.out.println("The value pop is::: " + tempNode.next.value);
                        tempNode.next = null;
                        n.next = null;
                        tail = n;
                        return;
                    }

                }

            }

        }

    }
}

class Node {
    int value;
    Node next;
}
