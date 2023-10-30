import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(words));

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(String s: ts){
            current.next = new ListNode(s.length());
            current = current.next;
        }

        return dummy.next;
    }
}
