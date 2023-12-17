import java.util.*;

public class Compound {
    public int getWeight(String comp, String atomics) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] a = atomics.split(",");

        for(String s: a){
            String[] array = s.split(":");
            String element = array[0];
            int weight = Integer.parseInt(array[1]);
            map.put(element, weight);
        }

        int total = 0;
        
        String[] arr = comp.split("");
        for(int i=0; i<arr.length-1; i++){
            String current = arr[i];
            String next = arr[i+1];
            if(!isNum(current) && !isNum(next)){
                total += map.get(current);
            }

            if(!isNum(current) && isNum(next)){
                total += map.get(current) * Integer.parseInt(next);
            }
        }

        if(!isNum(arr[arr.length-1])){
            total += map.get(arr[arr.length-1]);
        }

        return total;        
    }

    private boolean isNum(String s){
        return "23456789".indexOf(s) >= 0;
    }
}

