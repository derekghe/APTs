public class AccessLevel {
    String result = "";
     public String canAccess(int[] rights, int minPermission) {
            for(int i = 0; i < rights.length; i++){
                if(rights[i] >= minPermission){
                    result = result + "A";
                }
                else{
                    result = result + "D";
                }
            }
            return result;
     }
  }