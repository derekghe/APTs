import java.util.*;

//finding the word that occurs least frequently of all the words
public class Infrequent {
    public String find(String[] phrases){
        String ret = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: phrases){
            String[] array = s.toLowerCase().split(" ");
            for(String word: array){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        int min = Collections.min(map.values());
        for(String s: map.keySet()){
            if(map.get(s) == min){
                ret = s;
                break;
            }
        }
        return ret;
    }
}