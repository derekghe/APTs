public class AddSome {
    public ListNode splice(ListNode list, int size){
        ListNode remember = list;
        ListNode first = new ListNode(list.info);
        ListNode last = first;
        list = list.next;
        for(int k=0; k < size-1; k++){
            last.next = new ListNode(list.info);
            last = last.next;
            list = list.next;
        }
        last.next = remember;
        return first;
    }
  }