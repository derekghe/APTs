import java.util.*;

public class WeightedListSorter {
    public String[] sort (String[] words, ListNode weights) {
        
        TreeMap<String, Integer> map = new TreeMap<>();

        for(int i = 0; i < words.length; i++){
            map.put(words[i], weights.info);
            weights = weights.next;
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a,b) -> map.get(a) - map.get(b));

        return list.toArray(new String[0]);
    }
}