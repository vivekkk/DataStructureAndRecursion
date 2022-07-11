import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {

    TreeNode root;

    public AVLTree() {

        root = null;
    }

    public TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            TreeNode node = new TreeNode();
            node.value = value;
            node.hight = 1;
            return node;
        } else if (root.value > value) {
            root.left = insertNode(root.left, value);
        } else {
            root.right = insertNode(root.right, value);
        }
        root.hight = (1 + Math.max(gethight(root.left), gethight(root.right)));

        int balance = getBalance(root);

        if (balance > 1 && root.left.value > value) {
            return leftLeftCondition(root);
        }
        if (balance > 1 && root.left.value < value) {
            return leftRightConditiono(root);
        }
        if (balance < -1 && root.right.value < value) {
            return rightRightCondition(root);
        }
        if (balance < -1 && root.right.value > value) {
            return rightLeftCondition(root);
        }

        return root;

    }

    public int gethight(TreeNode node) {
        if (node == null) {
            return 0;
        } else
            return node.hight;
    }

    public int getBalance(TreeNode node) {
        int bal = gethight(root.left) - gethight(root.right);
        return bal;
    }

    public int gethighttest(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + gethighttest(node.left);
        }
    }

    public TreeNode leftLeftCondition(TreeNode root) {
        TreeNode newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        newRoot.right.hight = (1 + Math.max(gethight(newRoot.right.left), gethight(newRoot.right.right)));
        newRoot.hight = (1 + Math.max(gethight(newRoot.left), gethight(newRoot.left)));
        return newRoot;
    }

    public TreeNode rightRightCondition(TreeNode root) {
        TreeNode newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;
        newRoot.left.hight = (1 + Math.max(gethight(newRoot.left.left), gethight(newRoot.left.right)));
        newRoot.hight = (1 + Math.max(gethight(newRoot.left), gethight(newRoot.left)));
        return newRoot;
    }

    public TreeNode rightLeftCondition(TreeNode root) {
        TreeNode newRoot = root.right.left;
        root.right.left = newRoot.right;
        root.right = newRoot.left;
        newRoot.right = root.right;
        newRoot.left = root;
        newRoot.left.hight = (1 + Math.max(gethight(newRoot.left.left), gethight(newRoot.left.right)));
        newRoot.hight = (1 + Math.max(gethight(newRoot.left), gethight(newRoot.left)));
        return newRoot;

    }

    public TreeNode leftRightConditiono(TreeNode root) {
        TreeNode newRoot = root.left.right;
        root.left.right = newRoot.left;
        root.left = newRoot.right;
        newRoot.left = root.left;
        newRoot.right = root;
        newRoot.right.hight = 1 + Math.max(newRoot.right.left.hight, newRoot.right.right.hight);
        newRoot.hight = 1 + Math.max(newRoot.left.hight, newRoot.right.hight);

        return newRoot;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    public void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        } else {
           System.out.print(node.value+ "->");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }

    }

    public void postorserTraversal(TreeNode node) {
        if (node == null) {
            return;
        } else {

            postorserTraversal(node.left);
            postorserTraversal(node.right);
            System.out.println(node.value);
        }

    }

    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        } else {

            inorderTraversal(node.right);
            System.out.println(node.value);
            inorderTraversal(node.left);
        }

    }

    public void levelOrderTraversal(TreeNode node) {
           Queue<TreeNode> q=new LinkedList<TreeNode>();
           q.add(node);
           while(!q.isEmpty())
           {
            TreeNode t=q.remove();
            System.out.println(t.value);
            if(t.left !=null)
            {
                q.add(t.left);
            }
            if(t.right !=null)
            {
                q.add(t.right);
            }
            
           }


    }

    public static void main(String arg[]) {
        AVLTree tree = new AVLTree();
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(50);
        tree.insert(5);
        tree.insert(88);
        tree.levelOrderTraversal(tree.root);

    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    int hight;

    public TreeNode() {

        hight = 0;
    }
}