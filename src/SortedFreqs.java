import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        
        Map<String, Integer> map = new HashMap<>();

        for(String s: data){
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet()); //create list of Map.Entry objects representing a key-value pair

        list.sort(Map.Entry.comparingByKey());
        
        //Collections.sort(list, Map.Entry.comparingByKey()); sort the list based on the comparator Map.Entry.comparingByKey()

        int[] ret = new int[list.size()];
        
        for(int i = 0; i < ret.length; i++){
            ret[i] = list.get(i).getValue();
        }

        return ret;
    }
}