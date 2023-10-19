public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        if(list == null) return null;

        ListNode first = new ListNode(list.info);
        ListNode current = first;

        while(list != null){
            for(int i = 0; i < amount; i++){
                current.next = new ListNode(list.info);
                current = current.next;
            }
            list = list.next;
        }

        first = first.next;

        return first;
    }
}