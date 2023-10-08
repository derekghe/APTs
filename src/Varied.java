import java.util.*;

public class Varied {
    public String[] variedStrings(String[] words) {
        List<String>ret = new ArrayList<>();
        for(String w: words){
            String[] let = w.split("");
            if(canAdd(let)){
                ret.add(w);
            } 
        }
        return ret.toArray(new String[0]);
    }

    private boolean canAdd(String[] s){
        HashMap<String, Integer> map = new HashMap<>();
        for(String str: s){
            if(map.containsKey(str)) return false;
            map.put(str, 1);
        }
        return true;
    }
}