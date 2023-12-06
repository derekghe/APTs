public class AddAt {
    public ListNode addAt(ListNode list, ListNode toAdd, int index) {     
        
        if(toAdd == null) return list;
        
        ListNode last = toAdd;
        while(last.next != null){
            last = last.next; //setting pointer to end of toAdd
        }

        if(index == 0){ //special case when adding at head
            last.next = list;
            return toAdd;
        }

        //want current to point at -1 before the index
        //e.g. if index = 1, want current to point at 0
        ListNode current = list;
        for(int i=0; i < index-1; i++){
            current = current.next;
        }

        ListNode after = current.next;
        current.next = toAdd;
        last.next = after;

        return list;
    }
}