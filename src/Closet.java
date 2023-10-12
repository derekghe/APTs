import java.util.*;

public class Closet {
    public String anywhere(String[] list) {

        TreeSet<String> ts = new TreeSet<>();

        for(String str: list) {
            ts.addAll(Arrays.asList(str.split(" ")));
        }

        return String.join(" ", ts);
    }
}