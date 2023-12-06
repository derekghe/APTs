public class LeafSum {

    int sum = 0;

    public int sum(TreeNode t) {
        traverse(t);
        return sum;
    }

    private void traverse(TreeNode tree){
        if(tree == null) return;

        if(tree.left == null && tree.right == null){
            sum += tree.info;
        }

        traverse(tree.left);
        traverse(tree.right);
    }
}