import java.util.*;

public class OverEnroll {
    public String[] popular(String[] data) {
        String[] ret = new String[2];
        HashMap<String, Integer> map = new HashMap<>();

        for(String a: data){
            String[] array = a.split(":");
            String course = array[0];
            int size = Integer.parseInt(array[2]);
            map.put(course, map.getOrDefault(course, 0) + size);
        }

        int max = Collections.max(map.values());
        int min = Collections.min(map.values());

        for(String str: map.keySet()){
            if(map.get(str) == max) ret[0] = str + ":" + max;
            if(map.get(str) == min) ret[1] = str + ":" + min;
        }
        return ret;
    }
}