import java.util.ArrayList;

public class Swap {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2) {
        int temp = list.get(idx1);

        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);

        System.out.println(list);

        swap(list,0,4);

        System.out.println(list);
    }    
}
