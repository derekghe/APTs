public class ListUpper {
    public ListNode uplist (String[] words) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(String s: words){
            int num = 0;
            for(Character c: s.toCharArray()){
                if(Character.isUpperCase(c)){
                    num++;
                }
            }

            current.next = new ListNode(num);
            current = current.next;
        }
        
        return dummy.next;
    }
}