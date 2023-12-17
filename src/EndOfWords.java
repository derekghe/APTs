import java.util.*;

public class EndOfWords {
    public String[] filter(String[] words){
        HashSet<String> unique = new HashSet<>();
        ArrayList<String> ret = new ArrayList<>();

        for(String s: words){
            String[] array = s.split("");
            String first = array[0];
            String last = array[array.length-1];
            if(first.equals(last) && !unique.contains(first)){
                ret.add(s);
                unique.add(first);
            }
        }

        return ret.toArray(new String[0]);
    }
  }