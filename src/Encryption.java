import java.util.*;

public class Encryption {
    public String encrypt(String message){
        char[] c = message.toCharArray();
        char[] ret = new char[message.length()];
        int charNum = 97;
        Map<Character, Character> map = new HashMap<>();

        for(int i=0; i < message.length(); i++){
            char letter = c[i];
            if(!map.containsKey(letter)){
                map.put(letter, (char) charNum);
                charNum++;
            }
            ret[i] = map.get(letter);
        }

        String msg = "";
        for (char a: ret){
            msg += a;
        }
        return msg;
    }
}