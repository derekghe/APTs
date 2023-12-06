public class TreeGrowLeaves {
    public TreeNode grow(TreeNode root, int value) {
        
        if(root == null) return null;

        value += root.info;

        if(root.left == null){
            root.left = new TreeNode(value);
        } else{
            root.left = grow(root.left, value);
        }

        if(root.right == null){
            root.right = new TreeNode(value);
        } else{
            root.right = grow(root.right, value);
        }
        
        return root;
    }
}