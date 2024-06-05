public class QuickSort {

    public static int partition(int arr[],int l,int r) {
        
        int pivot = arr[r];

        int i = l-1;

        for(int j = l ;j< r;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i]; //swap
                arr[i] = arr[j]; 
                arr[j] = temp;
            }
        }

        int temp = arr[i+1]; //swap
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1; //return pivot ele 
    }

    public static void quickSort(int arr[],int l,int r) {
        
        if(l<r){
            int pi = partition(arr,l,r); //find pivot ele

            //partition along pivot ele
            //on left smaller then pivot 
            //on right greater then pivot
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, r);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,5,7,3,6,9,3,5,21,10};

        int n = arr.length;
        quickSort(arr,0,n-1);

        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
