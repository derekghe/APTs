public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if(t == null) return null;
        return new TreeNode(height(t), rewire(t.left), rewire(t.right));
    }


    private int height(TreeNode tn){
        if(tn == null) return 0;

        return  1 + Math.max(height(tn.left), height(tn.right));
    }
}