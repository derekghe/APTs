public class ListDuplicateMe {
public ListNode duplicate(ListNode list) {  
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(list != null){
            for(int k = 0; k < list.info; k++){
                current.next = new ListNode(list.info);
                current = current.next;
            }
            list = list.next;
        }

        return dummy.next;    
    }
}