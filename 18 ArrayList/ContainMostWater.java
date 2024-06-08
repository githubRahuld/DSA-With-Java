import java.util.ArrayList;

public class ContainMostWater {

    public static int containingMostWater(ArrayList<Integer> water) {
        int low = 0;
        int hi = water.size()-1;

        int maxWater = 0; 
        while(low<hi){
            int currWater = Math.min(water.get(low),water.get(hi))*(hi-low);

            if(currWater > maxWater){
                maxWater = currWater;
            }

            if(water.get(low) < water.get(hi)){
                low++;
            }else{
                hi--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> water = new ArrayList<>();

        water.add(1);
        water.add(8);
        water.add(6);
        water.add(2);
        water.add(5);
        water.add(4);
        water.add(8);
        water.add(3);
        water.add(7);

        System.out.println(containingMostWater(water));
    }
}
