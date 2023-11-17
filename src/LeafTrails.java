import java.util.*;

public class LeafTrails {

    Map<Integer, String> tm = new TreeMap<>();

    public String[] trails(TreeNode tree) {
        findPath(tree, "");
        
        List<String> ret = new ArrayList<>(tm.values());
        return ret.toArray(new String[0]);
    }

    private void findPath(TreeNode tree, String path){
        if(tree == null) return;

        if(tree.left == null && tree.right == null){
            tm.put(tree.info, path);
            return;
        }
        
        findPath(tree.left, path + "0");
        findPath(tree.right, path + "1");
    }
    
}