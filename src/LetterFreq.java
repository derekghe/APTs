import java.util.*;

public class LetterFreq {
    public String findFreqs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: words){
            String[] a = s.split("");
            for(String b: a){
                map.put(b, map.getOrDefault(b,0) +  1);
            }
        }

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] letters = alpha.split("");
        String[] ret = new String[letters.length];

        for(int i=0; i<letters.length; i++){
            String let = letters[i];
            if(map.containsKey(let)){
                ret[i] = Integer.toString(map.get(let));
            }
            else{
                ret[i] = "0";
            }
        }

        return String.join(":", ret);
    }
}