public class BinaryTreeUsingLL {
    BinaryNode root;

    BinaryTreeUsingLL(int value)
    {
        BinaryNode node=new BinaryNode();
        node.value=value;
        this.root=node;
        System.out.println("Binary tree is created using the Linked list");
    }

    public void insertInBinaryTree(BinaryNode root,int value)
    {
        if (root==null)
        {
            return;
        }

        if(root.value>value)
        {
            if(root.left==null)
            {
                BinaryNode node= new BinaryNode();
                node.value=value;
                root.left=node;
            }
            else{
                insertInBinaryTree(root.left, value);
            }
        }

        if(root.value<value)
        {
            if(root.right==null)
            {
                BinaryNode node= new BinaryNode();
                node.value=value;
                root.right=node;
            }
            else{
                insertInBinaryTree(root.right, value);
            }
        }

    }

    public static void main(String arg[])
    {
        BinaryTreeUsingLL btul=new BinaryTreeUsingLL(50);
        btul.insertInBinaryTree(btul.root, 15);
        btul.insertInBinaryTree(btul.root, 75);
        btul.insertInBinaryTree(btul.root, 10);
        System.out.println(btul.root.value);
        System.out.println(btul.root.left.left.value);
    }
 
    
}

class BinaryNode{
 int value;
BinaryNode right;
BinaryNode left;

}