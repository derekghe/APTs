import java.util.*;

public class EqualCommon {
    public String[] matches(String[] a1, String[] a2) {

        Map<String, Integer> map = new TreeMap<>();

        for(String a: a1){
            map.put(a, map.getOrDefault(a,0) + 1);
        }

        for(String b: a2){
            map.put(b, map.getOrDefault(b,0) - 1);
        }

        List<String> ret = new ArrayList<>();

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 0){
                ret.add(entry.getKey());
            }
        }

        return ret.toArray(new String[0]);
    }
}