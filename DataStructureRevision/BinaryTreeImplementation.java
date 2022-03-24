import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {

    public static void main(String arg[]) {
        BinaryTree tree = new BinaryTree();
        BinaryNode root = tree.createBinaryTree(78);
        tree.insertInTree(root, 48);
        tree.insertInTree(root, 90);
        tree.insertInTree(root, 35);
        tree.insertInTree(root, 100);
        tree.insertInTree(root, 120);
        tree.insertInTree(root, 12);
        tree.insertInTree(root, 88);
        tree.insertInTree(root, 79);
        tree.insertInTree(root, 89);
        System.out.println(tree.root.right.right.value);
        tree.levelorderTraversal(root);

    }

}

class BinaryTree {
    BinaryNode root;

    public BinaryNode createBinaryTree(int value) {
        this.root = new BinaryNode();
        root.value = value;
        root.left = null;
        root.right = null;
        return root;

    }

    public BinaryNode insertInTree(BinaryNode root, int value) {

        if (root == null) {
            BinaryNode b = new BinaryNode();
            b.value = value;
            return b;

        } else if (value <= root.value) {
            root.left = insertInTree(root.left, value);

        } else {

            root.right = insertInTree(root.right, value);

        }
        return root;

    }

  

    public BinaryNode deleteNode(BinaryNode root, int value)
    {
        if (root.left==null && root.right==null){

      return root;}

      else if(value <root.value)
      {
          
      }
      else if(value >root.value)
      {
        root.left=deleteNode(root.left, value);
      }

    }

    public BinaryNode getSmallestNodeFromRightSubtree(BinaryNode root)
    {
        if(root.right==null && root.left==null)
        {
          return root;
        }
        if(root.left !=null)
        {
            root.left=getSmallestNodeFromRightSubtree(root.left);
        }
        else if(root.right !=null)
        {
            root.right=getSmallestNodeFromRightSubtree(root.right);
        }
        return root;



    }

    public void levelorderTraversal(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode b = queue.remove();
            System.out.print(b.value + "->");
            if (b.left != null) {
                queue.add(b.left);
            }
            if (b.right != null) {
                queue.add(b.right);
            }

        }

    }

}

class BinaryNode {

    int height;
    BinaryNode left;
    BinaryNode right;
    int value;
}
