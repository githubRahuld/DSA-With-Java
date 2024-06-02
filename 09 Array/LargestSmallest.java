public class LargestSmallest {

    public static void largestInArr(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0 ;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        System.out.println("largest value in array: "+largest);
    }

    public static void smallestInArr(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }

        System.out.println("largest value in array: "+smallest);
    }

    public static void main(String[] args) {
        int arr[] = {2,5,-2,641,81,30};

        largestInArr(arr);
        smallestInArr(arr);
    }    
}
