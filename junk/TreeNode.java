import java.util.LinkedList;
import java.util.Queue;



public class TreeNode { //This is my solution for coding exercise 35 from the GPT course..
    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public int size = 0;

    public TreeNode(int d) {
        data = d;
        size = 1;
    }

    public static TreeNode createMinimalBST(int[] array) throws Exception {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(array[0]);
        q.add(root);
        int i = 0;
        while (i < array.length) {
            TreeNode node = q.remove();
            if ((2 * i + 1) < array.length) {
                TreeNode nodeleft = new TreeNode(array[(2 * i) + 1]);
                node.left = nodeleft;
                node.size = node.size + 1;
                q.add(nodeleft);
            } 
            if ((2 * i + 2) < array.length) {
                TreeNode noderight = new TreeNode(array[(2 * i) + 2]);
                node.right = noderight;
                // node.size=node.size+1;
                q.add(noderight);

            }else{
                break;
            }
            i = i + 1;

        }

        return root;

    }

   static  void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode presentNode = queue.remove();
          System.out.print(presentNode.data + "->");
          if (presentNode.left != null) {
            queue.add(presentNode.left);
          }
          if (presentNode.right != null) {
            queue.add(presentNode.right);
          }
        }
      }

    public static void main(String arg[]) {
        try {
            int[] a = { 12, 56, 89, 90, 91, 92, 93, 95 };
            TreeNode t = TreeNode.createMinimalBST(a);
             TreeNode.levelOrder(t);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
