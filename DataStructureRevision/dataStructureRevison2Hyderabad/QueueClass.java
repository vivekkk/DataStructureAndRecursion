import javax.lang.model.util.ElementScanner14;

public class QueueClass {

    int[] queueArray;
    int size;
    int firstIndex;
    int lastIndex;

    public QueueClass(int size) {
        queueArray = new int[size];
        this.size = size;
        this.firstIndex = -1;
        this.lastIndex = -1;
    }

    public boolean isEmpty() {
        if (firstIndex == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if ((lastIndex == (size - 1) && firstIndex == 0) || (firstIndex - lastIndex == 1)) {
            return true;
        } else
            return false;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Could not push The stack is full");
            return;
        } else {
            if (isEmpty()) {
                firstIndex = firstIndex + 1;
                queueArray[firstIndex] = value;
                lastIndex = lastIndex + 1;

            } else if (lastIndex == size - 1) {
                lastIndex = 0;
                queueArray[lastIndex] = value;

            } else {

                lastIndex = lastIndex + 1;
                queueArray[lastIndex] = value;
            }

        }

   
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Nothing can be poped as the queue is empty");
        }
        else
        {
            if(firstIndex==lastIndex && firstIndex !=-1)
            {
              System.out.println("Value poped is " + queueArray[firstIndex]);
              firstIndex=-1;
              lastIndex=-1;
            }
            else if(firstIndex==size-1 && lastIndex<firstIndex)
            {
                System.out.println("Value poped is " + queueArray[firstIndex]);
                firstIndex=0;
            }else
            {
                System.out.println("Value poped is " + queueArray[firstIndex]);
                firstIndex=firstIndex+1;
            }
        }

    }


    public static void main(String arg[]) {
        QueueClass q = new QueueClass(6);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.pop();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(8);
        q.pop();
        q.push(9);
        q.pop();
        q.push(10);
        q.pop();
        q.pop();
        q.push(11);
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();

    }
}
