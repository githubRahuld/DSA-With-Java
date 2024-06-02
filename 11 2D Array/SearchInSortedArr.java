public class SearchInSortedArr {

    public static boolean searchInSortedArr(int matrix[][],int key){ //O(n+m)

        int row = 0, col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found at index: ("+row+" , "+col+")");
                return true;
            }else if(key < matrix[row][col]){
                // move left
                col--;
            }else{
                //move buttom
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static boolean searchInSortedArr2(int matrix[][],int key){ //O(n+m)

        int row = matrix.length-1, col = 0;

        while(col<matrix[0].length && row>=0){
            if(matrix[row][col] == key){
                System.out.println("Key found at index: ("+row+" , "+col+")");
                return true;
            }else if(key < matrix[row][col]){
                // move top
                row--;
            }else{
                //move right
                col++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int key = 8;
        searchInSortedArr(matrix,key); //starting from (0,m-1)
        searchInSortedArr2(matrix,key); //starting from (n-1,0)
    }    
}
