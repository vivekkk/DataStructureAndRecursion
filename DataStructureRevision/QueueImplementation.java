public class QueueImplementation {

    public static void main(String arg[]) {

        Queue q = new Queue(1);
        q.pop();
        q.push(5);
        q.push(7);
        q.pop();
        q.push(44);
        q.push(89);
        q.pop();
        q.push(56);
        q.pop();
        q.push(59);
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.push(69);
        q.push(99);
        q.push(29);
        q.pop();

    }

}

class Queue {
    int[] queueArray;
    int size;
    int topOfIndex;
    int firstMemberIndex;

    public Queue(int size) {
        queueArray = new int[size];
        this.size = size;
        this.topOfIndex = -1;
        this.firstMemberIndex = -1;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else if (topOfIndex - firstMemberIndex >= 1) {
            System.out.println("The value poped up is " + queueArray[firstMemberIndex]);
            queueArray[firstMemberIndex] = 0;
            firstMemberIndex = firstMemberIndex + 1;
        } else if (topOfIndex == firstMemberIndex) {
            System.out.println("The value poped up is " + queueArray[firstMemberIndex]);
            queueArray[firstMemberIndex] = 0;
            topOfIndex = -1;
            firstMemberIndex = -1;
        } else if (topOfIndex < firstMemberIndex && firstMemberIndex == size - 1) {
            System.out.println("The value poped up is " + queueArray[firstMemberIndex]);
            queueArray[firstMemberIndex] = 0;
            firstMemberIndex = 0;

        } else {
            System.out.println("The value poped up is " + queueArray[firstMemberIndex]);
            queueArray[firstMemberIndex] = 0;
            firstMemberIndex = firstMemberIndex + 1;

        }

    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else if (isEmpty()) {
            queueArray[0] = value;
            topOfIndex = topOfIndex + 1;
            System.out.println("The value pushed is value " + value);
            firstMemberIndex = firstMemberIndex + 1;
        } else if (topOfIndex < size - 1 && firstMemberIndex == 0) {
            queueArray[topOfIndex + 1] = value;
            System.out.println("The value pushed is value " + value);
            topOfIndex = topOfIndex + 1;
        } else if (topOfIndex == size - 1 && firstMemberIndex > 0) {
            queueArray[0] = value;
            System.out.println("The value pushed is value " + value);
            topOfIndex = 0;
        } else if (topOfIndex < firstMemberIndex && firstMemberIndex - topOfIndex > 1) {
            queueArray[topOfIndex + 1] = value;
            System.out.println("The value pushed is value " + value);
            topOfIndex = topOfIndex + 1;
        } else {
            queueArray[topOfIndex + 1] = value;
            System.out.println("The value pushed is value " + value);
            topOfIndex = topOfIndex + 1;
        }

    }

    public boolean isFull() {
        if (topOfIndex == size - 1 && firstMemberIndex == 0) {
            return true;
        } else if (topOfIndex < firstMemberIndex && firstMemberIndex - topOfIndex == 1) {
            return true;
        } else
            return false;
    }

    public boolean isEmpty() {
        if (topOfIndex == -1 && firstMemberIndex == -1) {
            return true;
        } else {
            return false;
        }
    }

}
