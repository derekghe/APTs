public class PathLabel {
    public TreeNode label(TreeNode t) {
        if(t == null) return null;

        return new TreeNode(leaves(t), label(t.left), label(t.right));
    }

    private int leaves(TreeNode t){

        int sum = 0;

        if(t == null) return 0;
        
        if(t.left == null && t.right == null) sum++;
        
        return sum + leaves(t.left) + leaves(t.right);
    }
}