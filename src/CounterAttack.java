public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        int[] array = new int[words.length];
        String[] strLetters = str.split(" ");
    
        for(int i = 0; i < array.length; i++){
            array[i] = occurrences(strLetters, words[i]);
        }
        return array;
    }

    private int occurrences(String[] letters, String c){
        int count = 0;
        for(String a: letters){
            if(a.equals(c)) count++;
        }
        return count;
    }
}