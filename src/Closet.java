import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        ArrayList<String> words = new ArrayList<>();
        for(String s: list){
            String[] element = s.split(" ");
            words.addAll(Arrays.asList(element));
        }

        Collections.sort(words);
        HashSet<String> set = new LinkedHashSet<>();
        set.addAll(words);
        
        return String.join(" ", set);
    }
  }