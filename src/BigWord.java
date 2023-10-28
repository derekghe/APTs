import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        Map<String, Integer> map = new HashMap<>();

        for(String str: sentences){
            String[] words = str.split(" ");
            for(String s: words){
                String lower = s.toLowerCase();
                map.put(lower, map.getOrDefault(lower, 0) + 1);
            }
        }

        int most = Collections.max(map.values());

        for(String word: map.keySet()){
            if(map.get(word) == most) return word;
        }

        return "";

    }
}