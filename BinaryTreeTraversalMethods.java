import java.util.Queue;
import java.util.LinkedList;

class BinaryTreeTraversalMethods {

    public static void main(String arg[]) {
        TreeNode node1 = new TreeNode("Root");
        TreeNode node2 = new TreeNode("LeftNode");
        TreeNode node3 = new TreeNode("RightNode");
        TreeNode node4 = new TreeNode("Node2Left");
        TreeNode node5 = new TreeNode("Node2Right");
        TreeNode node6 = new TreeNode("Node3Left");
        TreeNode node7 = new TreeNode("Node3Right");
        TreeNode node13 = new TreeNode("Node2-Left-Left");
        TreeNode node14 = new TreeNode("Node2-Left-Right");

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node13;
        node4.right = node14;
        node1.levelOrderTraversal(node1);
        System.out.println("\n");
        TreeNode node10 = new TreeNode("NewNodeAdded");
         node1.addingNodeToTree(node1,node10);
        // node1.preorderTraversal(node1);
        System.out.println("");
        node1.levelOrderTraversal(node1);
        TreeNode.deleteNode(node1, "RightNode");
        System.out.println("");
        node1.levelOrderTraversal(node1);
        // System.out.println("the deepest node is " +
        // TreeNode.findDeepestNode(node1).value);

    }

}

class TreeNode {

    TreeNode left;
    TreeNode right;
    String value;

    public TreeNode(String value) {
        this.value = value;
    }

    public void levelOrderTraversal(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(node);
        while (!q.isEmpty()) {

            TreeNode node2 = q.remove();
            System.out.print(node2.value + "->");
            if (node2.left != null) {
                q.add(node2.left);
            }
            if (node2.right != null) {
                q.add(node2.right);
            }

        }
    }

    public void preorderTraversal(TreeNode node) {
        if (node == null) {
            System.out.println("The tree is empty;");
            return;
        }
        System.out.print(node.value + "->");

        if (node.left != null) {
            preorderTraversal(node.left);
        }
        if (node.right != null) {
            preorderTraversal(node.right);
        }

    }

    public void addingNodeToTree(TreeNode node, TreeNode newNode) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                TreeNode node2 = q.remove();
                //System.out.println(node2.value);
                if (node2.left == null) {
                    node2.left = newNode;
                    return;
                } else if (node2.right == null) {
                    node2.right = newNode;
                    return;
                }

                if (node2.left != null) {
                    TreeNode node11 = node2.left;
                    q.add(node11);
                }
                if (node2.right != null) {
                    TreeNode node12 = node2.right;
                    q.add(node12);
                }

            }

        }

    }

    public static LinkedList<TreeNode> searchNodebyValue(TreeNode root, String value) {
        if (root == null) {
            System.out.println("The tree is empty");
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode previous = q.peek();
            TreeNode tempNode = q.remove();
            if (tempNode.left.value == value) {
                LinkedList<TreeNode> tll = new LinkedList<>();
                tll.addFirst(previous);
                tll.addLast(tempNode.left);
                return tll;
            } else if (tempNode.right.value == value) {
                LinkedList<TreeNode> tll = new LinkedList<>();
                tll.addFirst(previous);
                tll.addLast(tempNode.right);
                return tll;

            }

            else {

                if (tempNode.left != null) {
                    q.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    q.add(tempNode.right);
                }

            }
        }

        return null;

    }

    public static void deleteNode(TreeNode root, String value) {
        TreeNode deepestNode = TreeNode.findDeepestNode(root);
        // System.out.println("deepestNode:"+ deepestNode.value);
        LinkedList<TreeNode> tl = TreeNode.searchNodebyValue(root, deepestNode.value);
        // System.out.println("Deepest node previous: "+ tl.get(0).value);
        // System.out.println("Deepest node getlast: "+ tl.get(1).value);
        LinkedList<TreeNode> tl2 = TreeNode.searchNodebyValue(root, value);
        TreeNode nodetobedeleNode = tl2.get(1);
        // System.out.println("Node to be deleted is :" + tl2.get(1).value);
        TreeNode previous = tl.get(0);
        TreeNode node = tl.get(1);
        nodetobedeleNode.value = node.value;
        if (previous.right == null) {
            previous.left = null;
        } else {
            previous.right = null;
        }

    }

    public static TreeNode findDeepestNode(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        if (node == null) {
            System.out.println("The tree is empty");
            return null;
        }
        q.add(node);
        TreeNode testNode = node;

        while (!q.isEmpty()) {
            testNode = q.remove();

            if (testNode.left != null) {
                q.add(testNode.left);
            }
            if (testNode.right != null) {
                q.add(testNode.right);
            }
        }
        // System.out.println("TestNode: "+ testNode.value);

        return testNode;

    }

    public void deleteBinaryTree(TreeNode root)
    {
        System.out.println("deleting the binary tree with root node "+ root.value);
        root=null;
        System.out.println("Binary tree deleted");

    }

}
