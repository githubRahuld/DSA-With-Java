import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(41);
        list.add(7);
        list.add(-2);

        int maxEle = Integer.MIN_VALUE;

        for(int i = 0;i<list.size();i++){
            if(list.get(i) > maxEle){
                maxEle = list.get(i);
            }
        }
        System.out.println(maxEle);
    }    
}
