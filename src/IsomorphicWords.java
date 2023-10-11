import java.util.*;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        int count = 0;

        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(encrypt(words[i]).equals(encrypt(words[j])))
                count++;
            }
        }

        return count;
    }


    private String encrypt(String str){
        String ret = "";

        HashMap<String, Integer> map = new HashMap<>();

        String[] array = str.split("");
        int index = 0;
        for(int i=0; i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i], index);
                index++;
            }

            ret += Integer.toString(map.get(array[i]));
        }
        return ret;
    }
}