import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        List<Integer> sum = new ArrayList<>();

        if(list.length % 2 == 0){
            for(int i=0; i < list.length; i+=2){
                sum.add(list[i] + list[i+1]);
            }
        }
        else{
            for(int i=0; i < list.length-1; i+=2){
                sum.add(list[i] + list[i+1]);
            }
            sum.add(list[list.length-1]);
        }
        
        int[] ret = new int[sum.size()];
        for(int k = 0; k < ret.length; k++){
            ret[k] = sum.get(k);
        }
        return ret;
    }
 }