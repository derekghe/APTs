public class Totality {

     public int sum(int[] a, String stype) {
         int sum = 0;
         for(int i = 0; i < a.length; i++){
            if(stype.equals("odd") && i % 2 == 1)
                sum+= a[i];
            
            if(stype.equals("even") && i % 2 == 0)
                sum+= a[i];
            
            if(stype.equals("all"))
                sum+= a[i];
         }
         return sum;
     }
     
 }