import javax.lang.model.util.ElementScanner14;

class Main {

    public static void main(String arg[]) {
        AVLTree tree = new AVLTree(40);
        tree.insertNode(tree.root, 20);
        tree.insertNode(tree.root, 60);
        tree.insertNode(tree.root, 30);
        tree.insertNode(tree.root, 100);
        tree.insertNode(tree.root, 70);
        tree.insertNode(tree.root, 66);
        tree.preorderTraversal(tree.root);
        tree.searchNode(tree.root, 70);
        System.out.println(tree.searchNode(tree.root, 70).value);

    }
}

public class AVLTree {
    TreeNode root;

    public AVLTree(int value) {
        TreeNode node = new TreeNode();
        node.value = value;
        node.left = null;
        node.right = null;
        this.root = node;
        System.out.println("Tree Created");

    }

    public TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            TreeNode node = new TreeNode();
            node.value = value;
            node.height=1;
            return node;
        } else if (value <= root.value) {
            root.left = insertNode(root.left, value);
        } else if (value > root.value) {
            root.right = insertNode(root.right, value);
        }
        root.height=(1+ Math.max( getHeight(root.left),getHeight(root.right)));
        int balanceofNode=getBalance(root);
        if(balanceofNode>1 && root.left.value<value)
        {
            root=rightRotation(root);
            return root;
        }
        if(balanceofNode>1 && root.left.value<value)
        {
           root.left= leftRotation(root.left);
            root=rightRotation(root);
            return root;

        }

        //Here two more conditions are left for insertion try to complete them yourself..




        
    }

    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.value);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

    }

    public TreeNode searchNode(TreeNode root, int value) {
        if (root == null) {
            return null;
        } else if (value == root.value) {
            return root;
        } else if (value < root.value) {
            return searchNode(root.left, value);
        } else {
            return searchNode(root.right, value);
        }

    }

    private TreeNode rightRotation(TreeNode disbalanceNode)
    {
        TreeNode newRoot=disbalanceNode.left;
        disbalanceNode.left=disbalanceNode.left.right;
        newRoot.right=disbalanceNode;
        disbalanceNode.height=(1+ Math.max( getHeight(disbalanceNode.left),getHeight(disbalanceNode.right)));
        newRoot.height=(1+ Math.max( getHeight(newRoot.left),getHeight(newRoot.right)));
        return newRoot;                
    }

    private TreeNode leftRotation(TreeNode disbalanceNode)
    {
        TreeNode newRoot=disbalanceNode.right;
        disbalanceNode.right=disbalanceNode.right.left;
        newRoot.left=disbalanceNode;
        disbalanceNode.height=(1+ Math.max( getHeight(disbalanceNode.left),getHeight(disbalanceNode.right)));
        newRoot.height=(1+ Math.max( getHeight(newRoot.left),getHeight(newRoot.right)));
        return newRoot;                
    }


    private int getBalance(TreeNode node)
    {
        int balance=getHeight(node.left) - getHeight(node.right);
        return balance;

    }


    private  int  getHeight(TreeNode node){
        if (node==null)
        {
        return 0;
        }
        else{
            return node.height;
        }
        


    }

}

class TreeNode {
    int height;
    int value;
    TreeNode left;
    TreeNode right;

}