import java.util.ArrayList;

public class RotatedPairSum {

    public static boolean rotatedArrPairSum(ArrayList<Integer> list,int key) {
        
        int n = list.size();
        int bp = -1;    //breaking point 
        for(int i = 0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int low = bp+1;
        int hi = bp;

        while(low != hi){
       
            if(list.get(low)+list.get(hi) == key){
                System.out.println(low+","+hi);
                return true;
            }else if(list.get(low)+list.get(hi) < key){
                low = (low+1)%n;
            }else{
                hi = (n + hi - 1) % n;
            }
        }
        
        return false;
    }
   public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int key = 16;
        System.out.println(list);

        System.out.println(rotatedArrPairSum(list,key));
   } 
}
