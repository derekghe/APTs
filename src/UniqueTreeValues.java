import java.util.*;

public class UniqueTreeValues {
    TreeSet<Integer> ts = new TreeSet<>();

    public int[] unique(TreeNode root) {

        addAll(root);

        int[] ret = new int[ts.size()];

        int i = 0;
        for(Integer val: ts){
            ret[i] = val;
            i++;
        }

        return ret;
    }

    public void addAll(TreeNode root){
        if(root == null) return;

        ts.add(root.info);

        addAll(root.left);
        addAll(root.right);
    }
}