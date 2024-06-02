public class SubArraySum {

    public static int maxSubArrSum(int arr[]){

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                int currSum = 0;
                for(int k = i;k<=j;k++){
                    currSum += arr[k];
                }
               
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        // int arr[] = {2,4,6,8,10};

        System.out.println(maxSubArrSum(arr));
        
    }    
}
