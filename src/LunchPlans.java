import java.util.*;

public class LunchPlans {        
    public String[] favorites(String[] preferences) {
        List<String> ret = new ArrayList<>();
        HashMap<String, Integer>map = new HashMap<>();

        for(String a: preferences){
            String[] foods = a.split(" ");
            for(String b: foods){
                map.put(b, map.getOrDefault(b, 0) + 1);
            }
        }

        String[] str = preferences[0].split(" ");
        List<String> first = new ArrayList<>(Arrays.asList(str));
        
        for(String c: first){
            if(map.get(c) == preferences.length){
                ret.add(c);
            }
        }

        return ret.toArray(new String[0]);
    }
}