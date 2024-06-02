public class BinarySearch {

    public static int binarySearch(int arr[],int key){

        int index = -1;
        int n = arr.length;
        

        int l = 0;
        int r = n-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == key){
                index = mid;
                break;
            }else if(arr[mid] > key){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,7,9,23};

        int key = 23;
        int result = binarySearch(arr,key);

        if(result == -1){
            System.out.println("Key Not Found :( ");
        }else{
            System.out.println("Key found at index: "+ result);
        }
    }    
}
