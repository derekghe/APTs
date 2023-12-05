public class ListMutation {
    public ListNode alter(ListNode list) {
        if(list == null) return null;


        list.next = alter(list.next);

        if(list.info % 2 == 1){
            return list.next;
        } else {
            return new ListNode(list.info, list);
        }
    }
}