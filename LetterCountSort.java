import java.util.*;

public class LetterCountSort {

    String special;

    public String[] sort(String[] list, String specialChars) {
        special = specialChars;
        Arrays.sort(list);
        
        Arrays.sort(list, (a,b) -> count(a) - count(b));
        return list;
    }

    private int count(String str){
        int ret = 0;

        for(Character c: str.toCharArray()){
            if(special.indexOf(c) > -1){
                ret++;
            }
        }

        return ret;
    }
}