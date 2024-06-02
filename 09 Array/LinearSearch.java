public class LinearSearch {

    public static int linearSearch(int numbers[],int key){

        int index = -1;

        for(int i = 0 ;i<numbers.length;i++){
            if(numbers[i] == key){
                index  = i;
                break;            
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int numbers[] = {1,3,4,5,8,6,10};

        int key = 4;

        int result = linearSearch(numbers, key);

        if(result == -1){
            System.out.println("Key Not Found :( ");
        }else{
            System.out.println("Key found at index: "+ result);
        }
    }    
}
