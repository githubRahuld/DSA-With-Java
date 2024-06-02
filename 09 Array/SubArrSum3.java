public class SubArrSum3 {

public static void subArrSumOptimised(int arr[]) {
    
    int maxSum = Integer.MIN_VALUE;

    int currSum = 0;
    for(int i = 0 ;i<arr.length;i++){
        currSum += arr[i]; 
        if(currSum < 0){
            currSum = 0;
        }

        maxSum = currSum > maxSum ?  currSum : maxSum;

    }
    System.out.println("Max Sum is :"+maxSum);
}

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        //using kedanes algorithm
        subArrSumOptimised(arr);
    }    
}
