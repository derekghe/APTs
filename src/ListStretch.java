public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(list != null){
            for(int i=0; i<amount; i++){
                current.next = new ListNode(list.info);
                current = current.next;
            }
            list = list.next;
        }

        return dummy.next;
    }
}