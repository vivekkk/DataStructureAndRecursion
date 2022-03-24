class BinaryHeapImplement {
    public static void main(String arg[]) {
        BinaryHeap bh = new BinaryHeap(10);
        bh.insertInBinaryHeap(1);
        bh.insertInBinaryHeap(2);
        bh.insertInBinaryHeap(3);
        bh.insertInBinaryHeap(4);
        bh.insertInBinaryHeap(5);
        bh.insertInBinaryHeap(6);
        bh.insertInBinaryHeap(7);
        bh.insertInBinaryHeap(8);
        bh.insertInBinaryHeap(9);
        bh.insertInBinaryHeap(10);
        bh.insertInBinaryHeap(11);
        bh.leavelOrderTraversal();
        System.out.println("\n");
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();
        bh.deleteFromBinaryHeap();
        bh.deleteFromBinaryHeap();
        bh.deleteFromBinaryHeap();
        bh.leavelOrderTraversal();

    }
}

class BinaryHeap {
    int heapArray[];
    int size;

    // Constructor Initialization
    public BinaryHeap(int size) {
        heapArray = new int[size + 1];
        size = 0;
        System.out.println("Binary heap created successfully..");

    }

    public void insertInBinaryHeap(int value) {
        if (isEmpty()) {
            heapArray[1] = value;
            size = size + 1;
        } else {
            if (size <= heapArray.length - 2) {
                heapArray[size + 1] = value;
                size = size + 1;
                heapify(size, "min");

            } else {

                System.out.println("Heap Array is full..");
            }

        }

    }

    public void heapify(int index, String heapType) {
        if (heapType.equalsIgnoreCase("min")) {
            int parent = index / 2;
            if (index <= 1) {
                return;
            } else {
                if (heapArray[index] < heapArray[parent]) {
                    swap(index, parent);

                }

            }
            heapify(parent, "min");
        }

    }

    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("The Array is empty");
            return true;
        } else
            return false;
    }

    public void swap(int index, int parent) {
        int temp = heapArray[index];
        heapArray[index] = heapArray[parent];
        heapArray[parent] = temp;

    }

    public void leavelOrderTraversal() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heapArray[i] + "->");
        }

    }

    public void deleteFromBinaryHeap() {
        if (!isEmpty()) {
            System.out.println("The element deleted from heap Tree is: " + heapArray[1]);
            heapArray[1] = heapArray[size];
            size = size - 1;
            heapifyTopToBottom(1, "min");

        }

    }

    public void heapifyTopToBottom(int parent, String heapType) {
        
        int child1 = 2 * parent;
        int child2 = 2 * parent + 1;
        int minChildIndex=0;
        System.out.println("Parent is "+ parent + " and parent value is " + heapArray[parent]);
        if (child1 <=size  && child2 <=size) {
            minChildIndex = findMinvalue(child1, child2);
            if (heapType.equalsIgnoreCase("min")) {
                if(heapArray[parent]>=heapArray[minChildIndex])
                 {
                System.out.println(" first if");
                swap(minChildIndex, parent);
               }

            }

        } else if (child1 == size) {
            System.out.println(" IInd if");
            if(heapArray[parent]>=heapArray[child1])
            {
            minChildIndex = child1;
            swap(child1, parent);
            }

        }

        else {
            System.out.println("The heap tree is heapified");
            return;
        }
        if(minChildIndex !=0)
        {
        heapifyTopToBottom(minChildIndex, "min");
        }
    }

    public int findMinvalue(int child1, int child2) {

        if (heapArray[child1] > heapArray[child2]) {
            return child2;
        } else
            return child1;

    }

}