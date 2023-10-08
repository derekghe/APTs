import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        HashSet <String> inStock = new HashSet<>(Arrays.asList(available));

        for(int i = 0; i < orders.length; i++){
            String [] toppings = orders[i].split(" ");
            ArrayList <String> list = new ArrayList<>(Arrays.asList(toppings));

            if(inStock.containsAll(list)) return i;
        }

        return -1; 
    }
}