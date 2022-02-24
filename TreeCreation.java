import java.util.ArrayList;

class TreeCreation{

    public void createTree(TreeNode root, String value)
    {
        root.parent=null;
        root.value=value;
        root.siblings.add(null);
    

    }
    
    


}


class TreeNode{
    String value;
    TreeNode parent;
    ArrayList<TreeNode> siblings;

    // public TreeNode(String value)
    // {
    //     this.value=value;
    // }
}