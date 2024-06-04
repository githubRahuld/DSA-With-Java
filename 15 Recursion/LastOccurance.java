public class LastOccurance {

    public static int findLastOccurance(int arr[],int i ,int key) {
        
        if(i == arr.length-1) return -1;

        int isFound = findLastOccurance(arr, i+1, key);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,2,9,5,10,2,5,3};

        int key = 2;
    
        System.out.println(findLastOccurance(arr,0,key));
    }    
}
