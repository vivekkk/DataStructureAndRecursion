

public class QueueImplementationWithArray {

    public static void main(String arg[]) {
        Queue q = new Queue(5);
        q.dequeue();
        q.enqueue(1);
        System.out.println("BeginingOfTheQueue" + q.beginingOfQueue);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(8);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("BeginingOfTheQueue" + q.beginingOfQueue);
        System.out.println("topOftheQueue of the queue" + q.topOftheQueue);
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}

class Queue {

    int topOftheQueue;
    int beginingOfQueue;
    int[] QueueArray;

    public Queue(int size) {
        this.QueueArray = new int[size];
        this.topOftheQueue = -1;
        this.beginingOfQueue = -1;
        System.out.println("The Queue is created successfully!!");

    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            QueueArray[topOftheQueue + 1] = value;
            topOftheQueue = topOftheQueue + 1;
            beginingOfQueue = 0;

            System.out.println(value + " pushed to the stack at position topOftheQueue");
        }

    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(QueueArray[beginingOfQueue] + " is removed from the queue");
            QueueArray[beginingOfQueue] = 0;
            if (beginingOfQueue > topOftheQueue || beginingOfQueue == QueueArray.length - 1) {
                beginingOfQueue = -1;
                topOftheQueue = -1;
            } else
                beginingOfQueue = beginingOfQueue + 1;

        }

    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("peek value is " + QueueArray[beginingOfQueue]);

        }

    }

    public boolean isEmpty() {
        if (beginingOfQueue == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (topOftheQueue == QueueArray.length - 1)
            return true;
        else
            return false;
    }

    public void deleteQueue() {
        QueueArray = null;
        topOftheQueue = -1;
        beginingOfQueue = -1;

        System.out.println("Queue is deleted");

    }

}
