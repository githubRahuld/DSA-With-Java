public class SearchInRotatedArr {

    public static int searchForKey(int arr[],int key){

        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(arr[mid] == key) return mid;
            else if(arr[l] <= arr[mid]){ // check of left half shorted or not
                if(key >= arr[l] && key <= arr[mid]){ // check key lie in this half
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }else{
                // check key present in this half
                if(key >= arr[mid] && key <= arr[r]){ 
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};

        int key = 33;

        System.out.println(searchForKey(arr,key));
        // hint:- identify the sorted half
    }    
}
