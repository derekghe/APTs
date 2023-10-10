public class ListCount {
    public int count (ListNode list) {
        int num = 0;

        while(list != null){
            num++;
            list = list.next;
        }
        
        return num;
    }
  }