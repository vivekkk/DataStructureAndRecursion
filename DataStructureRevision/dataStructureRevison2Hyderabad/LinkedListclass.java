public class LinkedListclass {
    Node head;
    Node tail;

    public void createLinkedList() {

        this.head = null;
        this.tail = null;
        System.out.println("Linked list created successfully");
    }

    public void insertionAtEndinLL(String value) {
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

    public void insertionAtBeginingLL(String value) {
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

    public void insertInBetween(int position, String value) {
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
                    if(tempNode.next==null)
                    {                       
                        tempNode.next=tempNode2;
                        tempNode2.next=null;
                        tail=tempNode;

                    }
                    else{
                   
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

    public static void main(String arg[]) {
        LinkedListclass l = new LinkedListclass();
        l.insertionAtEndinLL("vivek");
        l.insertionAtEndinLL("Neha");
        l.insertionAtEndinLL("Nav");
        l.insertionAtBeginingLL("Sushma");
        l.traverseLinkedList(l);
        l.insertInBetween(6, "Mahi");
        System.out.println("--------");
        l.traverseLinkedList(l);
    }

}

class Node {
    String value;
    Node next;

}
