import java.util.ArrayList;

public class BasicsOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add at end
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,8); //O(N)

        // get 
        System.out.println(list.get(2));

        // remove
        list.remove(1);

        // contains
        System.out.println(list.contains(3)); //true or false

        // set
        list.set(2, 33);

        //print list
        System.out.println(list); 


        // size 
        System.out.println(list.size());

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }    
}
