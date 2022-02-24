

public class StackImplementationbyArray {
    public static void main(String arg[]) {
        Stack s = new Stack(5);
        s.push(4);
        s.push(5);
        s.push(3);
        s.push(48);
        s.push(57);
        s.push(99);
        s.push(78);
        s.peek();
        s.pop();
        s.pop();
        s.delete();
        System.out.println(s.isEmpty());

    }
}

class Stack {
    int strackArray[];
    int topOfTheStack;

    public Stack(int size) {
        this.strackArray = new int[size];
        this.topOfTheStack = -1;
        System.out.println("Stack is initialized successfully");

    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full could not push elements");
        } else {
            System.out.println("Value :" + value + "pushed succesfully");
            strackArray[topOfTheStack + 1] = value;
            topOfTheStack = topOfTheStack + 1;
        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {

            System.out.println(strackArray[topOfTheStack]);
            strackArray[topOfTheStack] = 0;
            topOfTheStack = topOfTheStack - 1;

        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {

            System.out.println(strackArray[topOfTheStack]);

        }
    }

    void delete() {
        strackArray = null;
        topOfTheStack = -1;
        System.out.println("Stack is deleted succesfully");
    }

    boolean isEmpty() {
        if (topOfTheStack == -1) {
            return true;
        } else
            return false;

    }

    boolean isFull() {
        if (topOfTheStack == strackArray.length - 1)
            return true;
        else
            return false;
    }

}
