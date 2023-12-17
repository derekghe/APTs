import java.util.*;

public class TreeDivide {
    TreeNode create(String[] list) {

        if(list.length == 0) return null;

        int mid = list.length/2;
        int current = list[mid].length();

        String[] l = Arrays.copyOfRange(list, 0, mid);
        String[] r = Arrays.copyOfRange(list, mid+1, list.length);
    
        return new TreeNode(current, create(l), create(r));
        
    }
}