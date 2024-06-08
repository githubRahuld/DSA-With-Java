import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        list.add(2);
        list.add(87);
        list.add(21);

        System.out.println(list);
        Collections.sort(list); //accending
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder()); //decending
        System.out.println(list);
    }    

}
