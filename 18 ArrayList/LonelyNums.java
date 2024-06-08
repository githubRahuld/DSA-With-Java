import java.util.ArrayList;
import java.util.Collections;

public class LonelyNums {

    public static void lonelyNums(ArrayList<Integer> list) {
        
        Collections.sort(list);
        int n = list.size();
        
        ArrayList<Integer> result = new ArrayList<>();

        if(n == 1){//only one Element
            result.add(list.get(0));
        }
        
        for(int i = 1;i<list.size()-1;i++){

            //check for less and equality
            if((list.get(i-1)+ 1 < list.get(i)) && list.get(i)+1 < list.get(i+1)){
                result.add(list.get(i));
            }
        }

        if(n > 1){
            //check for 0th Element
            if(list.get(0)+1 < list.get(1)){
                result.add(list.get(0));
            }

            //check for last Element
            if(list.get(n-2) +1 < list.get(n-1)){
                result.add(list.get(n-1));
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        // list.add(1);
        // list.add(3);
        // list.add(5);
        // list.add(3);

        lonelyNums(list);
    }
    // Ques:- You are given an integer arraylist nums. A number x is lonely when it     appears only once, and
    // no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist
}
