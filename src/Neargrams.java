import java.util.*;

public class Neargrams {
    public int numOfNeargrams(String words) {
        String[] arr = words.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++){
            HashMap<String, Integer> map1 = freqMap(arr[i]);
            for (int j = i + 1; j < arr.length; j++){
                HashMap<String, Integer> map2 = freqMap(arr[j]);
                if (canMake(map2, map1) && canMake(map1, map2)){
                    count++;
                }
            }                       
        }
        return count;

    }
    public HashMap<String, Integer> freqMap(String word){
        HashMap<String, Integer> map = new HashMap<>();
        String[] s = word.split("");
        for(String str: s){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        return map;
    }

    public boolean canMake(HashMap<String, Integer> map1, HashMap<String, Integer> map2){
        for (String s : map2.keySet()){
            if (!map1.containsKey(s)){
                return false;
            }
            if (Math.abs(map2.get(s) - map1.get(s)) > 1){
                return false;
            }
        }
        return true;
    }
}
