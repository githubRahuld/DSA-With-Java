import java.util.ArrayList;

public class TwoPointerSum {

    public static boolean twoPointerSum(ArrayList<Integer> list,int key) {

        int low = 0;
        int hi = list.size()-1;
    
        while(low<hi){
            if(list.get(low)+list.get(hi) == key){
                System.out.println(low+","+hi);
                return true;
            }else if(list.get(low)+list.get(hi) > key){
                hi--;
            }else{
                low++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int key = 7;
        System.out.println(twoPointerSum(list,key));
    }
}
