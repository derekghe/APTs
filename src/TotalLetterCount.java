public class TotalLetterCount {
    public int total(String[] words, String letter) {
        int total = 0;
        
        for(int i=1; i<words.length; i++){
            int count = 0;
            String[] s = words[i].split("");
            for(String a: s){
                if(a.equals(letter)){
                    count++;
                }
            }
            total = total + (i*count);
        }
        return total;
    }
}