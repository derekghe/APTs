import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        
        Map<String, Integer> headline = new HashMap<>(); //count frequency of each letter in headlines, letter to freq
        for(String a: headlines){ 
            String[] s = a.toLowerCase().split(""); //split each letter in string after lowercase
            for(String letter: s){
                if(!letter.equals(" ")){
                    headline.put(letter, headline.getOrDefault(letter,0) + 1);
                }
            }
        }

        for(String m: messages){
            boolean canMake = true;
            Map<String, Integer> msg = new HashMap<>();
            String[] b = m.toLowerCase().split("");

            for(String letter: b){
                if(!letter.equals(" ")){
                    msg.put(letter, msg.getOrDefault(letter,0) + 1);
                }                
            }

            for(String s: msg.keySet()){
                if(!headline.containsKey(s) || msg.get(s) > headline.get(s)){
                    canMake = false;
                }
            }
            if(canMake) count++;
        }

        return count;
    }

    // public static void main(String[] args){
    //     String[] headlines ={"Earthquake in San Francisco", "Burglary at musuem in Sweden", "Poverty"};

    //     String[] messages ={"Give me my money back","I am the best coder", "TOPCODER"};

    //     Map<String, Integer> headline = new HashMap<>();
    //     //count frequency of each letter in headlines, letter to freq
    //     for(String a: headlines){
    //         String[] s = a.toLowerCase().split("");
    //         for(int i=0; i < s.length; i++){
    //             String letter = s[i];
    //             if(!letter.equals(" ")){
    //                 headline.put(letter, headline.getOrDefault(letter,0) + 1);
    //             }
    //         }
    //     }

    //     for (String s : headline.keySet()){
    //         System.out.println(s + " " + headline.get(s));
    //     }
    // }
}




    