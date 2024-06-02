public class SubArrSum2 {

    public static void subArrSum(int arr[]) {

        // calculate prefix array which store current sum 
        int prefixSum[]= new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefixSum[i] += arr[i-1];
        }


        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                
                int currSum = i==0 ? prefixSum[j] : ( prefixSum[j] - prefixSum[i-1]);
               
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        subArrSum(arr);
    }
}
