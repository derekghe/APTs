public class List2Long {
      public long convert(ListNode list) {
        long num = 0;
         while(list != null){
            num = num*10 + list.info;
            list = list.next;
         }
         return num; 
      }
  }