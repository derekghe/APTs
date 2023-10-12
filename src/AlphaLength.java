import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(words));
        ArrayList<String> list = new ArrayList<>(ts);

        ListNode first = new ListNode(list.get(0).length(), null);
        ListNode current = first;

        for(int i=1; i<list.size(); i++){
            current.next = new ListNode(list.get(i).length(), null);
            current = current.next;
        }

        return first;
    }
}
