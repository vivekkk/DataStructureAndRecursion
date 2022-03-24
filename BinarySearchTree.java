import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.util.ElementScanner14;

class BinarySearchTree {

    TreeNode root;

    public TreeNode insertNode(TreeNode currentNode, int value) {
        if (currentNode == null) {
            TreeNode newNode = new TreeNode(value);
            return newNode;
        } else if (currentNode.value >= value) {
            // System.err.println(value);
            currentNode.left = insertNode(currentNode.left, value);
            return currentNode;
        } else {
            // System.out.println(value);
            currentNode.right = insertNode(currentNode.right, value);
            return currentNode;
        }

    }

    public void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value);
        preorderTraversal(node.left);
        preorderTraversal(node.right);

    }

    public TreeNode FindNodeinTreePreorder(TreeNode node, int value) {

        if (node == null) {
            return null;
        } else if (node.value == value) {

            return node;

        } else if (value <= node.value) {

            // System.out.println("leftfindnoderecursion");
            return FindNodeinTreePreorder(node.left, value);
        } else {

            // System.out.println("rightfindnoderecursion");
            return FindNodeinTreePreorder(node.right, value);
        }

    }

    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.println(node.value);
        inorderTraversal(node.right);

    }

    public void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }

    public void levelOrderTraversal(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            TreeNode t = q.remove();
            System.out.print("->" + t.value);
            if (t.left != null) {
                q.add(t.left);
            }
            if (t.right != null) {
                q.add(t.right);
            }
        }

    }

    public TreeNode searchNodeIntree(TreeNode node,int value)
    {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode tempNode=new TreeNode();
        q.add(node);
        if(node.value==value) return node;
        while (!q.isEmpty()) {
            TreeNode t = q.remove();
            System.out.print("->" + t.value);
            if (t.left != null) {
                if(t.left.value==value)
                {
                    tempNode=t.left;
                }
                else
                q.add(t.left);
            }
            if (t.right != null) {
                if(t.left.value==value)
                {
                    tempNode=t.right;
                    
                }
                q.add(t.right);
            }
        }
        return tempNode;

    }

    private TreeNode findLeastNodeFromrightSubtree(TreeNode node) {
        int value1;
        TreeNode tempNode=new TreeNode(node.right.value);
        if(node.right==null)
        {
            return node;
        }
       else{       
        
        Queue<TreeNode> q = new LinkedList<>();
        value1=node.right.value;
        q.add(node.right);
        while (!q.isEmpty()) {
            TreeNode t = q.remove();
         //  System.out.print("->" + t.value);
            if (t.left != null) {
                if(t.left.value<=value1)
                {
                    value1=t.left.value;
                    tempNode=t.left;
                }
                q.add(t.left);
            }
            if (t.right != null) {
                if(t.right.value<=value1)
                {
                    value1=t.right.value;
                    tempNode=t.right;
                }
                q.add(t.right);
            }
        }
    
        //System.out.println("The least node returned by function is "+ value1);
       // System.out.println("smallest node returned is  "+ tempNode.value);
        return tempNode;
    }

    }

    public void deleteNode(TreeNode root, int value) { // delete node has three cases
        TreeNode successor = successorOfNode(root, value);
        TreeNode node = FindNodeinTreePreorder(root, value);
        if (successor == null) {
            System.out.println("Node successfully deleted "+ node.value);
            node=null;           
            
            
        } else if (successor != null) {

              if(value<successor.value){
            node.value = successor.value;
            node.right=successor.right;
            }
            else{
                node.value=successor.value;
                node.left=successor.left;
            }

            successor=null;
            System.out.println("Node successfully deleted");

        }

    }

    public TreeNode successorOfNode(TreeNode root, int value) {
        TreeNode node = FindNodeinTreePreorder(root, value);
        //System.out.println("Node found in the tree" + node.value);
        //System.out.println("90 left node is "+ node.left.value);
       // System.out.println("90 right node is " + node.right.value);
        if (node.left != null && node.right != null) {
            TreeNode t = findLeastNodeFromrightSubtree(node);

         //   System.out.println("Least node from  the subtree" + node.value);
            return t;
        }
        if (node.left == null && node.right == null) {
            System.out.println("executed");
            return null;
        } else if (node.left != null && node.right == null) {
            System.out.println("executed2");
            return node.left;
        } else {
            System.out.println("executed3");
            return node.right;
        }

    }

    public deleteTreeNode(TreeNode root, int value)
    {
        if(root==null)

        {
            return null;
        }
        else if(value<root.value)
        {
            deleteTreeNode(root.left, value);
        }
        else if(value>root.value)
        {
            deleteTreeNode(root.right, value);
        }
        

    }

    public static void main(String arg[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insertNode(tree.root, 45);
        tree.insertNode(tree.root, 90);
        tree.insertNode(tree.root, 110);
        tree.insertNode(tree.root, 70);
        tree.insertNode(tree.root, 30);
        tree.insertNode(tree.root, 20);
        tree.insertNode(tree.root, 105);
        tree.insertNode(tree.root, 150);
        tree.insertNode(tree.root, 250);
        tree.insertNode(tree.root, 88);
        tree.insertNode(tree.root, 120);
        //tree.preorderTraversal(tree.root);
        System.out.println("----------------");
        //tree.postOrderTraversal(tree.root);
        System.out.println("----------------");
       // tree.inorderTraversal(tree.root);
        System.out.println("----------------");
      //  tree.levelOrderTraversal(tree.root);
        // TreeNode t = tree.FindNodeinTreePreorder(tree.root, 150);
        // System.out.println("Node found value left is --" + t.left.value);
        // System.out.println("----------------");
        // System.out.println("Node found value is " + t.value);
        // System.out.println("Node found right node value is " + t.right.value);
        // System.out.println("Node found left node value is " + t.left.value);
       // TreeNode t2 = tree.findLeastNodeFromrightSubtree(tree.root.right);
        System.out.println("----------------");
       // System.out.println("smallest node is " + t2.value);
    //    TreeNode t3 = tree.successorOfNode(tree.root,150);
    //    System.out.println("successor of node 110 " + t3.value);
    tree.levelOrderTraversal(tree.root);
        tree.deleteNode(tree.root, 90);
        //tree.levelOrderTraversal(tree.root);
      // tree.preorderTraversal(tree.root);
      System.out.println("----------------");
      tree.levelOrderTraversal(tree.root);

    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;

    }

    TreeNode() {
        this.value = 0;
        this.left = null;
        this.right = null;

    }
}