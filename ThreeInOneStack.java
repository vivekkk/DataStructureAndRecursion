public class ThreeInOneStack {

    private int numOfStacks = 3;
    int size;
    int values[];
    int eachStackSize[];
    int offset[];

    public ThreeInOneStack(int size) {
        this.size = size;
        this.values = new int[size * numOfStacks];
        this.eachStackSize = new int[numOfStacks];
        this.offset = new int[numOfStacks];
        for (int i = 0; i < offset.length; i++) {
            this.offset[i] = -1;
        }
    }

    public boolean isFull(int stackNum) {
        stackNum = stackNum - 1;
        if (eachStackSize[stackNum] == size) {
            // System.out.println("The stack "+stackNum + " is full");
            return true;
        } else
            return false;
    }

    public boolean isEmpty(int stackNum) {
        stackNum = stackNum - 1;
        if (eachStackSize[stackNum] == 0) {
            // System.out.println("The stack "+stackNum + " is Empty");
            return true;
        } else
            return false;
    }

    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("The stack is full");
            return;

        } else if (isEmpty(stackNum)) {
            stackNum = stackNum - 1;
            values[offset[stackNum] + 1 + stackNum * 3] = value;
            offset[stackNum] = offset[stackNum] + 1 + stackNum * 3;
            eachStackSize[stackNum] = eachStackSize[stackNum] + 1;
        } else {
            stackNum = stackNum - 1;
            values[offset[stackNum] + 1] = value;
            offset[stackNum] = offset[stackNum] + 1;
            eachStackSize[stackNum] = eachStackSize[stackNum] + 1;

        }

    }

    public void pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The stack " + stackNum + " is empty");
            return;
        } else {


            if (offset[stackNum - 1] != 3 * stackNum - 3) {
                int value = values[offset[stackNum - 1]];
                System.out.println("popup value from stack " + stackNum + " is  " + value);
                values[offset[stackNum - 1]]=0;
                offset[stackNum - 1] = offset[stackNum - 1] - 1;
                eachStackSize[stackNum-1] = eachStackSize[stackNum-1] -1;

            }
            else
            {
            int value = values[offset[stackNum - 1]];
            System.out.println("popup value from stack " + stackNum + " is  " + value);
            values[offset[stackNum - 1]]=0;
            eachStackSize[stackNum-1] = eachStackSize[stackNum-1] -1;
            }

        }

    }

    public static void main(String args[]) {
        ThreeInOneStack th = new ThreeInOneStack(3);
        th.isFull(1);
        th.isEmpty(1);
        th.push(1, 4);
        th.push(1, 4);
        th.push(1, 4);
        th.push(1, 4);
        th.push(2, 5);
        th.push(2, 5);
        th.push(2, 5);
        th.push(2, 5);
        th.push(2, 5);
        th.push(3, 8);
        th.push(3, 8);
        th.push(3, 8);
        th.push(3, 8);
        th.push(3, 8);
        System.out.println(th.eachStackSize[0]);  
        th.pop(1);
        System.out.println(th.eachStackSize[0]);  
        th.pop(2);
        th.pop(1);
        System.out.println(th.eachStackSize[0]);  
        th.pop(3);
        th.pop(1);
        System.out.println(th.eachStackSize[0]);  
        th.pop(1);
        System.out.println(th.eachStackSize[0]);  
        System.out.println(th.eachStackSize[1]);
        System.out.println(th.eachStackSize[2]);
        // for (int a : th.values) {
        //     System.out.println(a);

        // }

    }

}