import java.util.*;

public class WeightSort {
    public static void main(String[] args) {
        WeightSort obj = new WeightSort();
        String[] strs = {"CAT", "DOG", "BAT", "ANT"};
        String[] ret = obj.sort(strs);
        System.out.println(Arrays.toString(ret));
    }

    public String[] sort(String[] strs) {
        Arrays.sort(strs);
        
        Comparator<String> comp = (a,b) -> weight(a) - weight(b);
        Arrays.sort(strs, comp);
        
        return strs;
    }

    private int weight(String s){
        int ret = 0;

        for(Character ch: s.toCharArray()){
            int w = ch - 'A' + 1;
            ret += w;
        }
        return ret;
    }
}