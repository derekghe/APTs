public class ListLastFirst {
    public ListNode move(ListNode list) {
        if(list == null) return null; //nothing in list
        if(list.next == null) return list; //one thing in list
        
        ListNode prev = null;
        ListNode current = list;

        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next = null;
        current.next = list;

        return current;
    }
}