
import java.util.Queue;
import java.util.Stack;

import javax.naming.PartialResultException;

import java.util.Currency;
import java.util.LinkedList;

// This is binary search tree 
public class TreePractice {
    TreeNode root;

    TreePractice(int value) {
        root = new TreeNode();
        this.root.value = value;
        System.out.println("Tree Created with root Node: " + value);

    }

    public void insertIntoTree(TreeNode root, int value) {
        if (root == null) {
            return;
        }

        if (value > root.value) {
            if (root.right == null) {
                TreeNode node = new TreeNode();
                node.value = value;
                root.right = node;
            } else {

                insertIntoTree(root.right, value);
            }

        }

        if (value < root.value) {
            if (root.left == null) {
                TreeNode node = new TreeNode();
                node.value = value;
                root.left = node;
            } else {
                insertIntoTree(root.left, value);
            }
        }
    }

    public static void main(String arg[]) {
        TreePractice tp = new TreePractice(50);
        tp.insertIntoTree(tp.root, 25);
        tp.insertIntoTree(tp.root, 60);
        tp.insertIntoTree(tp.root, 15);
        tp.insertIntoTree(tp.root, 45);
        tp.insertIntoTree(tp.root, 90);
        tp.insertIntoTree(tp.root, 35);
        tp.insertIntoTree(tp.root, 65);
        tp.insertIntoTree(tp.root, 100);
        // System.out.println(tp.root.left.value + tp.root.right.value);
        // tp.preorderTraversal(tp.root);
        // tp.postOrderTraversal(tp.root);
        tp.levelOrderTraversal(tp.root);
        System.out.println("---");
        //tp.deleteNodeFromTree(tp.root, 45);
      //  System.out.println("---");
        tp.levelOrderTraversal(tp.root);
        tp.deleteNodefromBinarySearchTree(tp.root, 90);
        System.out.println("---");
        tp.levelOrderTraversal(tp.root);

    }

    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {

            System.out.print(root.value + "->");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + "->");

        }

    }

    public void InOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {

            InOrderTraversal(root.left);
            System.out.print(root.value + "->");
            InOrderTraversal(root.right);

        }

    }

    public void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode newrt = q.remove();
            System.out.print(newrt.value + "->");
            if (newrt.left != null) {
                q.add(newrt.left);
            }
            if (newrt.right != null) {
                q.add(newrt.right);
            }
        }

    }

    public TreeNode findNode(TreeNode root, int value) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode nodelast = new TreeNode();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode newrt = q.remove();
            // nodelast = newrt;
            if (newrt.value == value) {
                nodelast = newrt;
                return nodelast;
            }
            // System.out.println("Level order" + newrt.value);
            if (newrt.left != null) {
                q.add(newrt.left);
            }
            if (newrt.right != null) {
                q.add(newrt.right);
            }

        }
        System.out.println("Node cannot be found;");
        // TreeNode node = new TreeNode();
        nodelast.value = -1;
        return nodelast;
    }

    public TreeNode findDeepestNodeParent(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();

        q.add(root);
        while (!q.isEmpty()) {

            TreeNode newrt = q.remove();
            if (newrt.left != null || newrt.right != null) {
                s.push(newrt);
                //System.out.println("pushed " + newrt.value);
            }

            if (newrt.left != null) {
                q.add(newrt.left);
            }
            if (newrt.right != null) {
                q.add(newrt.right);
            }

        }
        // System.out.println("Node cannot be found;");

        return s.pop();

    }

    // this method is for a normal tree but for binary tree we may have different
    // method.
   

    public TreeNode findSmallestNodeFromRightSubtree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        } 
        else if (root.left != null) 
        {
           return findSmallestNodeFromRightSubtree(root.left);
        } else 
        {
           return findSmallestNodeFromRightSubtree(root.right);
        }
        
    }

    // find the smallest node from the right subtree: this is for the case of binary
    // search tree
    // when we want to delete a node which has both the right node and the first
    // node:

    public void deleteNodefromBinarySearchTree(TreeNode root, int value) {
        TreeNode node = findNode(root, value);//
        System.out.println("Node to be deleted " + node.value);
        TreeNode smallesetNode=findSmallestNodeFromRightSubtree(node);//
        System.out.println("Smallestnode from right subtree " + smallesetNode.value);
        TreeNode smallestnodeParent=findParentNode(root, smallesetNode.value);
        System.out.println("Smallestnode parent " + smallestnodeParent.value);
        TreeNode nodeParent=findParentNode(root, value);
        System.out.println("Node to be delted parent " + nodeParent.value);
      // System.out.println("Node paretn" + nodeParent );
        TreeNode parentNode = findParentNode(root, value);
        if (node.left == null && node.right == null) {
            if (parentNode.left == node) {
                parentNode.left = null;

            } else {
                parentNode.right = null;
            }
        } else if (node.left != null && node.right != null) {
           

             node.value=smallesetNode.value;
             if(smallestnodeParent.left.value==smallesetNode.value)
             {
                smallestnodeParent.left=null;
             }else
             {
                smallestnodeParent.right=null;
             }

        } else {
            if(node.left !=null)
            {
                if(nodeParent.left==node)
                {
                   nodeParent.left=node.left;
                }
                else{
                    nodeParent.right=node.left;
                }
               
            }else{
                if(nodeParent.left==node)
                {
                   nodeParent.left=node.right;
                }
                else{
                    nodeParent.right=node.right;
                }
            }

        }

    }

    public TreeNode findParentNode(TreeNode root, int value) {
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        q.add(root);
        s.push(root);
        // TreeNode parentNode=new TreeNode();
        TreeNode curTreeNode = new TreeNode();
        while (!q.isEmpty()) {
            curTreeNode = q.remove();
            if (curTreeNode.left != null || curTreeNode.right != null) {
                s.push(curTreeNode);
            }
            if ((curTreeNode.left !=null && curTreeNode.left.value == value) || (curTreeNode.right !=null && curTreeNode.right.value == value)) {
                return s.pop();
            } else {

                if (curTreeNode.left != null) {
                    q.add(curTreeNode.left);
                }
                if (curTreeNode.right != null) {
                    q.add(curTreeNode.right);
                }
            }
        }
        return null;

    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
}