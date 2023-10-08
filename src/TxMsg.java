public class TxMsg {

    public String getMessage(String original) {
    String[] words = original.split(" ");
    for (int i = 0; i < words.length; i++){
        words[i] = convert(words[i]);
    }
    return String.join(" ", words);
    }

    private String convert (String word){
        String ret = "";

        if(!isVowel(word.charAt(0))){
            ret += word.charAt(0);
        }

        if(onlyVowels(word)){
            ret += word;
        }

        for(int i = 1; i < word.length(); i++){
            if (!isVowel(word.charAt(i)) && isVowel(word.charAt(i-1))) {
                ret += word.charAt(i);
            }
        }
        return ret;
    }

    private boolean isVowel(char ch){
        return "aeiou".indexOf(ch) >= 0;
    }

    private boolean onlyVowels(String text){
        for(int i = 0; i < text.length(); i++){
            if (!isVowel(text.charAt(i))){
                return false;
            }
        }
        return true;
    }
}