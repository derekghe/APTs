import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        int maxCount = 0;
        String ret = "";
        List <String> list = new ArrayList <>();

        //adding all elements into one big list
        for (String s: sentences){
            String [] a = s.split(" ");
            List <String> element = new ArrayList <>(Arrays.asList(a));
            for (String word: element){
                list.add(word.toLowerCase());
            }
        }

        //finding the word that occurs the most
        for (String b: list){
            int occurrences = Collections.frequency(list, b);  //googled this method
            if (occurrences > maxCount){
                maxCount = occurrences;
                ret = b;
            }
        }
        return ret;
    }
}