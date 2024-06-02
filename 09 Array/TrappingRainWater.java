public class TrappingRainWater {

    public static int trappingRainWater(int water[]){
        
        int n = water.length;

        int leftArr[] = new int[n];
        int rightArr[] = new int[n];

        leftArr[0] = water[0];
        rightArr[n-1] = water[n-1];

     
        // left max 
        for(int i = 1;i<n;i++){
            leftArr[i] = Math.max(water[i],leftArr[i-1]);
        }

        // right max
        for(int i = n-2; i>=0;i--){
           rightArr[i] = Math.max(water[i],rightArr[i+1]);
        }

        int maxTrappingWater = 0;
        for(int i = 0 ;i< n;i++){
            maxTrappingWater += Math.min(leftArr[i],rightArr[i]) - water[i];
        }

        return maxTrappingWater;

    }

    public static void main(String[] args) {
        int water[] = {4,2,0,6,3,2,5};

        int result = trappingRainWater(water);
        System.out.println(result);
    }    
}
