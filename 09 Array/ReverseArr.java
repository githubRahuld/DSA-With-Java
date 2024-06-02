public class ReverseArr {

    public static void reverseArr(int arr[]){


        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7};

        
        System.out.print("Before Sort: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        reverseArr(arr);

        System.out.println();

        System.out.print("After Sort: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    

}
