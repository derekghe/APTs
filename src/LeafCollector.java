import java.util.*;

public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        if(tree == null) return null;

        List<List<String>> rounds = new ArrayList<>();

        while(tree.left != null || tree.right != null){
            List<String> leaves = new ArrayList<>();
            collectAndRemove(tree, leaves);
            rounds.add(leaves);
        }

        //adding root
        List<String> root = new ArrayList<>();
        root.add(String.valueOf(tree.info));
        rounds.add(root);

        
        String[] ret = new String[rounds.size()];
        for(int i = 0; i < ret.length; i++){
            ret[i] = String.join(" ", rounds.get(i));
        }

        return ret;
    }

    private void collectAndRemove(TreeNode root, List<String> list){
        if(root == null) return;

        if(isLeaf(root.left)){
            list.add("" + root.left.info);
            root.left = null;
        }
        else{
            collectAndRemove(root.left, list);
        }
        
        if(isLeaf(root.right)){
            list.add("" + root.right.info);
            root.right = null;
        }
        else{
            collectAndRemove(root.right, list);
        }
    }

    private boolean isLeaf(TreeNode root){
        return root != null && root.left == null && root.right == null;
    }
}