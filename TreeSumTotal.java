public class TreeSumTotal {
    public int count(TreeNode tree, int target) {
        if(tree == null) return 0;

        int num = 0;
        if(sum(tree) == target){
            num++;
        }

        return num + count(tree.left, target) + count(tree.right, target);
    }

    private int sum(TreeNode root){
        if(root == null) return 0;

        return root.info + sum(root.left) + sum(root.right);
    }
}