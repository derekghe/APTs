import java.util.*;

public class WeightSort {
    public String[] sort(String[] strs) {
        
        Arrays.sort(strs);

        Arrays.sort(strs, (a,b) -> weight(a) - weight(b));

        return strs;
    }

    private int weight(String s){
        int sum = 0;

        for(Character c: s.toCharArray()){
            sum += c - 'A' + 1;
        }

        return sum;
    }
}