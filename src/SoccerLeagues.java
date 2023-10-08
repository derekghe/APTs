public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] point = new int[matches.length];
        
        for(int i = 0; i < matches.length; i++){
            String[] s = matches[i].split("");
            for(int j = 0; j < s.length; j++){ //checking every letter in each home team
                String result = s[j];
                if(!result.equals("-")){
                    if(result.equals("W")) point[i] += 3;
                    if(result.equals("D")){
                        point[i] += 1;
                        point[j] += 1;
                    }
                    if(result.equals("L")) point[j] += 3;
                }
            }
        }
        return point;
    }
}