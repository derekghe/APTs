import java.util.*;

public class SimpleWordGame {
    public int points(String[] player, 
                    String[] dictionary) {
        HashSet<String> set = new HashSet<>(Arrays.asList(player));

        int total = 0;
        for(String s : set){
            if (matches(s, dictionary)){
                total += s.length() * s.length();
            }
        }
        return total;

    }

    private boolean matches(String s, String[] d){
        return Arrays.asList(d).contains(s);
    }
}