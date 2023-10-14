import java.util.*;

public class ClassScores {
    public int[] findMode(int[] scores) {
        List<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: scores){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = Collections.max(map.values());

        for(Integer number: map.keySet()){
            if(map.get(number) == max){
                list.add(number);
            }
        }

        Collections.sort(list);
        int[] ret = new int[list.size()];
        for(int i=0; i<ret.length; i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}