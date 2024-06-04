public class FirstOccurance {

    public static int findFirstOccurance(int arr[],int i,int key) {
        
        if(i > arr.length-1) return -1;

        if(arr[i] == key){
            return i;
        }

        return findFirstOccurance(arr,i+1,key);

    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,2,9,5,10,2,5,3};

        int key = 2;
    
        System.out.println(findFirstOccurance(arr,0,key));
    }    
}
