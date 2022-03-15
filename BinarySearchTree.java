import java.util.LinkedList;
import java.util.Queue;


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

    public void levelOrderTraversal(TreeNode node)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
          TreeNode t=q.remove();
          System.out.print("->"+t.value);
          if(t.left!=null)
          {
              q.add(t.left);
          }
          if(t.right !=null)
          {
              q.add(t.right);
          }
        }


    }
    public void deleteNode(){

        
    }

    public static void main(String arg[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insertNode(tree.root, 45);
        tree.insertNode(tree.root, 90);
        tree.insertNode(tree.root, 110);
        tree.insertNode(tree.root, 30);
        tree.insertNode(tree.root, 150);
        tree.insertNode(tree.root, 250);
        tree.insertNode(tree.root, 88);
        tree.insertNode(tree.root, 120);
        tree.preorderTraversal(tree.root);
        System.out.println("----------------");
        tree.postOrderTraversal(tree.root);
        System.out.println("----------------");
        tree.inorderTraversal(tree.root);
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
}