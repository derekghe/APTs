public class AddSome {
    public ListNode splice(ListNode list, int size){

        ListNode remember = list;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(int i = 0; i < size; i++){
            current.next = new ListNode(list.info);
            list = list.next;
            current = current.next;
        }

        current.next = remember;

        return dummy.next;

    }
}
