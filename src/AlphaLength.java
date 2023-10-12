import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(words));
        ArrayList<String> list = new ArrayList<>(ts);

        ListNode first = new ListNode(list.get(0).length(), null);
        ListNode current = first;

        for(int i=1; i<list.size(); i++){
            current.next = new ListNode(list.get(i).length(), null);
            current = current.next;
        }

        return first;
    }
}

//java visualizer - https://cscircles.cemc.uwaterloo.ca/java_visualize/
// public class ClassNameHere {
//    static class ListNode {
//     int info;
//     ListNode next;
//     ListNode(int x){
//         info = x;
//     }
//     ListNode(int x, ListNode node){
//         info = x;
// 	next = node;
//     }
// }
//    public static void print(ListNode first){
//       while(first != null) {
//          System.out.printf("%d, ",first.info);
//          first=first.next;
//       }
//       System.out.println();
//    }
//    public static void main(String[] args) {
//       String[] set = {"be", "bee"};
//       ListNode first = null;
//         ListNode current = null;

//         for(String word: set) {
//             if(first == null) {
//                 first = new ListNode(word.length(), null);
//                 current = first;
//             } else {
//                 current.next = new ListNode(word.length(), null);
//                 current = current.next;
//             }
//         }
      
//    }
// }