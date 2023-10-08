import java.util.*;

public class Follower {
    public int[] follows(String[] words) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length-1; i++){
            String original = words[i];
            for(int j=i+1; j<words.length; j++){
                if(words[j].equals(original)){
                    list.add(i);
                    break;
                }
            }
        }

        int[] a = new int[list.size()];
        for(int i=0; i<a.length; i++){
            a[i] = list.get(i);
        }
        return a;
    }
  }