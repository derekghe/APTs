public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if(tree == null) return 0;

        if(tree.info == target) return 1;

        int diff = target - tree.info;

        if(hasPath(diff, tree.left) == 1){
            return 1;
        }
        else if(hasPath(diff, tree.right) == 1){
            return 1;
        }
        
        return 0;
    }
}