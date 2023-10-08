import java.util.*;

public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        int max = 0;
        for(Integer i: numbers){
            if(i>max){
                list.add(i);
                max = i;
            }
        }

        int[] a = new int[list.size()];
        for(int i=0; i<a.length; i++){
            a[i] = list.get(i);
        }
        return a;
    }
}