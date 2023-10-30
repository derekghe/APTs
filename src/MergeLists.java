public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        
        ListNode dummy = new ListNode(1);
        ListNode current = dummy;

        while(a != null){
            current.next = new ListNode(a.info);
            current = current.next;

            current.next = new ListNode(b.info);
            current = current.next;

            a = a.next;
            b = b.next;
        }

        return dummy.next;
    }
}