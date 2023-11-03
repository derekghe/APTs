import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        
        TreeMap<String, Integer> freqMap = new TreeMap<>();

        for(String s: data){
            freqMap.put(s, freqMap.getOrDefault(s,0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());

        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        
        //Collections.sort(list, Collections.reverseOrder(Map.Entry.comparingByValue()));

        String[] ret = new String[list.size()];
        
        for(int i = 0; i < ret.length; i++){
            ret[i] = list.get(i).getKey();
        }

        return ret;
    }
}