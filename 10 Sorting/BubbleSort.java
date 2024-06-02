public class BubbleSort {

    public static void swap(int i ,int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public static void bubbleSort(int arr[]){
        
        int n = arr.length;
        for(int turns = 0;turns<n-1;turns++){
            for(int j = 0;j<n-1-turns;j++){
               if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,30,1,-8,6,3,7};

        bubbleSort(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
