public class TreeImbalance {
    public int imbalance(TreeNode root) {
        
        if(root == null) return 0;

        int left = imbalance(root.left);
        int right = imbalance(root.right);
        int subTree = Math.max(left, right);

        int current = Math.abs(count(root.left) - count(root.right));

        return Math.max(current, subTree);
    }

    private int count(TreeNode root){
        if(root == null) return 0;
        
        return 1 + count(root.left) + count(root.right);
    }
}