import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(words));
        Collections.sort(al);
        HashSet<String> set = new LinkedHashSet<>(al);
        

        ListNode first = null;
        ListNode current = null;

        for(String word: set) {
            if(first == null) {
                first = new ListNode(word.length(), null);
                current = first;
            } else {
                current.next = new ListNode(word.length(), null);
                current = current.next;
            }
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