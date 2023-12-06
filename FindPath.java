import java.util.*;

public class FindPath {

    List<String> list = new ArrayList<>();

    public String path(TreeNode root, int target) {
        findPath(root, "", target);
        Collections.sort(list, Comparator.comparing(String::length).thenComparing(String::compareTo));
        if(list.size() == 0){
            return "nopath";
        }
        return list.get(0);
    }

    private void findPath(TreeNode tree, String path, int target){
        if(tree == null) return;

        if(tree.info == target){
            list.add(path);
            return;
        }

        findPath(tree.left, path + "0", target);
        findPath(tree.right, path + "1", target);
    }
}