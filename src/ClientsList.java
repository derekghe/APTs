import java.util.*;

public class ClientsList {
    public String[] dataCleanup(String[] names) {
        
        TreeMap<String, String> map = new TreeMap<>();

        int unique = 0;

        for(String str: names){
            unique++;
            if(unique == 10) unique = 0;
            
            if(hasCom(str)){
                String[] lastFirst = str.split(", ");
                map.put(lastFirst[1] + String.valueOf(unique), lastFirst[0]);
            } else{
                String[] firstLast = str.split(" ");
                map.put(firstLast[0] + String.valueOf(unique), firstLast[1]);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort((a,b) -> map.get(a).compareTo(map.get(b)));

        List<String> ret = new ArrayList<>();

        for(String key: list){
            ret.add(key.substring(0, key.length()-1) + " " + map.get(key));
        }

        return ret.toArray(new String[0]);
    }

    private boolean hasCom(String s){
        return s.indexOf(",") > -1;
    }
}