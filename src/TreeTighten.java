public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if(t == null) return null;
        if(t.left == null && t.right == null) return t;

        t.left = tighten(t.left);
        t.right = tighten(t.right);

        if(t.left == null){
            return t.right;
        }

        if(t.right == null){
            return t.left;
        }
        
        return t;
    }
}