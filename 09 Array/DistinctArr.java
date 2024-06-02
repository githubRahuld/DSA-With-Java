public class DistinctArr {

    public static boolean distinctArr(int arr[]){

        int maxEle = 0;
        for(int i = 0;i<arr.length;i++){
            maxEle = Math.max(maxEle, arr[i]);
        }

        int countArr[] = new int[maxEle];

        for(int i = 0 ;i<arr.length;i++){
            countArr[arr[i]-1]++; 
        }

        for(int i = 0;i<maxEle;i++){
            if(countArr[i] > 1){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4}; //true
        // int arr[] = {1,2,3,4,7,3}; //false

        System.out.println(distinctArr(arr));
    }    
}
