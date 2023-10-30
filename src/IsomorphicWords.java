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
        int value = 0;
        for(int i=0; i<array.length;i++){
            
            String key = array[i];

            if(!map.containsKey(key)){
                map.put(key, value);
                value++;
            }

            ret += Integer.toString(map.get(key));
        }
        return ret;
    }
}