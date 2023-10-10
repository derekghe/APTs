import java.util.*;

public class SetAside {
    public String common(String[] list) {
        List<String> ret = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(String words: list){
            String[] word = words.split(" ");
            for(String s: word){
                map.put(s, map.getOrDefault(s,0) + 1);
            }
        }

        String[] first = list[0].split(" ");
        for(String thing: first){
            if(map.get(thing) >= list.length){
                ret.add(thing);
            }
        }

        Collections.sort(ret);
        HashSet<String> set = new LinkedHashSet<>(ret);
        return String.join(" ", set);
    }
}