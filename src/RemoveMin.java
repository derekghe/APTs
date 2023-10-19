 public class RemoveMin {
    public ListNode remove (ListNode list) {
        if(list == null || list.next == null) return null;

        ListNode findMin = list;
        int min = findMin.info;

        while(findMin.next != null){
            if(findMin.next.info < min){
                min = findMin.next.info;
            }
            findMin = findMin.next;
        }
        
        ListNode first = list;
        while(list != null && list.next != null){
            if(list.info == min){ //min at beginning
                first = list.next;
                break;
            }

            if(list.next.info == min){
                list.next = list.next.next;
                break;
            }
            list = list.next;
        }

        return first;
    }
}