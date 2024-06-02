public class PrintSubarray {

    public static void printSubArray(int arr[]){
        int totalSubArr = 0;

        for(int i = 0 ;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i;k<=j ;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArr++;
                System.out.println();
            }
        }

        System.out.println("Total sub arrays: "+totalSubArr);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};

        printSubArray(arr);
    }    
}
