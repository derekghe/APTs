import java.util.*;

public class SimpleHash {
    public String[] calculate(String[] list){
        ArrayList<String> ret = new ArrayList<>();
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for(String s: list){
            String[] arr = s.split("");
            int simpleHash = 0;
            for(int i=0; i<arr.length; i++){
                simpleHash += index(arr[i]);
            }
            map.putIfAbsent(simpleHash, new ArrayList<>());
            map.get(simpleHash).add(s);
        }
        
        TreeSet<Integer> ts = new TreeSet<>(map.keySet());

        for(Integer value: ts){
            if(map.get(value).size() > 2){
                String str = String.join(" ", map.get(value));
                String thing = Integer.toString(value) + ":" + str;
                ret.add(thing);
            }
        }

        return ret.toArray(new String[0]);
    }

    private int index(String s){
        return "abcdefghijklmnopqrstuvwxyz".indexOf(s) + 1;
    }
}