import java.util.*;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int maxStringLength = 0;
        int maxStringCount = 0;
        String ret = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strands));
        ArrayList<String> word = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            if(list.get(i).contains(nuc)){
                word.add(list.get(i));
            }
        }

        for(String strand : word){
            if(nucCount(strand, nuc) > maxStringCount || 
            (nucCount(strand, nuc) == maxStringCount && strand.length() > maxStringLength)){
                maxStringCount = nucCount(strand, nuc);
                maxStringLength = strand.length();
                ret = strand;
            }
        }
        return ret;
    }

    private int nucCount (String str, String nuc){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+1).equals(nuc)){
                count ++;
            }
        }
        return count;
    }
}