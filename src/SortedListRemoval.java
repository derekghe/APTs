 public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
        
        if(list == null) return null;

        ListNode current = list;

        while(current.next != null){
            if(current.info == current.next.info){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

        return list;
    }
}