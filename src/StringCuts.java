import java.util.*;

public class StringCuts {
     public String[] filter(String[] list, int minLength) {
          
        HashSet<String> a = new LinkedHashSet<>();

        for (String word: list){
            if (word.length() >= minLength)
                a.add(word);
        }
        
        return a.toArray(new String[0]);
     }
 }
