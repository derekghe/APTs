import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        HashSet<String> one = new HashSet<>(Arrays.asList(club1));
        HashSet<String> two = new HashSet<>(Arrays.asList(club2));
        HashSet<String> three = new HashSet<>(Arrays.asList(club3));
        HashSet<String> liars = new HashSet<>();

        for(String s: one){
            if(two.contains(s) || three.contains(s)) liars.add(s);
        }

        for(String s: two){
            if(one.contains(s) || three.contains(s)) liars.add(s);
        }

        for(String s: three){
            if(one.contains(s) || two.contains(s)) liars.add(s);
        }

        String[] ret = liars.toArray(new String[0]);
        Arrays.sort(ret);
        return ret;
    }
}