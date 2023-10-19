public class DoubleList {
    public ListNode bigify(ListNode list){
        if(list == null) return null;

        ListNode afterMe = bigify(list.next);

        list.next = new ListNode(list.info,afterMe);
        return list;
    }

    // public ListNode bigify(ListNode list) {
    //     if(list == null) return null;

    //     ListNode first = new ListNode(list.info);
    //     ListNode current = first;

    //     while(list != null){
    //         for(int i = 0; i < 2; i++){
    //             current.next = new ListNode(list.info);
    //             current = current.next;
    //         }
    //         list = list.next;
    //     }

    //     first = first.next;

    //     return first;
    // }
}