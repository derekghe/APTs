import java.util.*;

public class Starter {
     public int begins(String[] words, String first) {
        int count = 0;
        HashSet<String> set = new HashSet<>(Arrays.asList(words));

        for(String newarr: set){
            if(newarr.startsWith(first)){
                count++;
            }
        }
         return count;
     }
 }