import javax.swing.plaf.synth.SynthOptionPaneUI;

class TreeImplementaionWithArray {

    public static void main(String arg[]) {
        Tree tree = new Tree(7);
        tree.addNode("RoopChand");
        tree.addNode("Shivdutt");
        tree.addNode("Somdutt");
        tree.addNode("Vivek");
        tree.addNode("Nav");
        tree.addNode("Sushil");
        tree.addNode("Veenu");
        // for(String x: tree.treeArray)
        // {
        // System.out.println("for loop "+ x);

        // }
        tree.preOrderTraversal(1);
        //tree.preOrderTraversal(1);
        System.out.println("");
        tree.postOrderTraversal(1);
        System.out.println("\n");
        tree.inOrderTraversal(1);
        System.out.println("\n");
        tree.levelOrderTraversal(1);
    }

}

class Tree {
    String treeArray[];
    int lastNodeIndex;
    int size;

    public Tree(int size) {
        this.size = size;
        treeArray = new String[size + 1];
        lastNodeIndex = 0;
        System.out.println("Blank tree of size: " + (size + 1) + " created");
    }

    public void addNode(String value) {
        if (isFull()) {
            System.out.println("Cannot insert value in the tree");
        } else {
            treeArray[lastNodeIndex + 1] = value;
            lastNodeIndex++;
            System.out.println("Node has been successfully inserted in tree");
        }
    }

    public boolean isFull() {
        if (lastNodeIndex == size) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (lastNodeIndex == 0) {
            return true;

        } else
            return false;

    }

    public void preOrderTraversal(int index) {
        String test = " ";

        if (isEmpty()) {
            System.out.println("The Tree is empty so cannot be traversed");
        } else {
            if (index <= treeArray.length - 1) {
                System.out.println(test.repeat(index)+ treeArray[index]);
                preOrderTraversal(2 * index);
                preOrderTraversal(2 * index + 1);
            }
        }

    }

    public void postOrderTraversal(int index) {
       

        if (isEmpty()) {
            System.out.println("The Tree is empty so cannot be traversed");
        } else {
            if (index >treeArray.length - 1) {
             return;   
            }
                postOrderTraversal(2 * index);
                System.out.println(" ".repeat(index) + treeArray[index]);
                postOrderTraversal(2 * index + 1);
            
        }

    }
    public void inOrderTraversal(int index)
    {

        if (isEmpty()) {
            System.out.println("The Tree is empty so cannot be traversed");
        } else {
            if (index >treeArray.length - 1) {
             return;   
            }
                inOrderTraversal(2*index);
                inOrderTraversal(2* index +1 );
                System.out.println(" ".repeat(index) + treeArray[index]);
                

    }
}

public void levelOrderTraversal(int index)
{ int count=0;
        for(String x: treeArray)
        {
        System.out.println(" ".repeat(count)+ x);
        count=count+1;
        

         }
    

}
}
