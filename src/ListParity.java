public class ListParity {
    public int count (ListNode list){
        int index = 0;
        int sum = 0;

        while (list != null){
            if(index % 2 == 0){
                sum += list.info;
            }
            list = list.next;
            index ++;
        }
        
        return sum;
    }
}