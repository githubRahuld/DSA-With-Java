public class SpiralMatrix {

    public static void printSpiral(int matrix[][]){

        int n = matrix.length , m = matrix[0].length;

        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;

        while(startRow <= endCol && startCol <= endCol){

            //top
            for(int j = startCol;j<=endCol;j++){ //i = row ,j= col
                System.out.print(matrix[startRow][j]+" ");
            }
            
            //right
            for(int i = startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
           
            //bottom
            for(int j = endCol-1;j>=startCol;j--){
                if(startRow ==endRow){ //same cell
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            
            //left
            for(int i = endRow-1;i>=startRow+1;i-- ){
                if(startCol ==endCol){ //same cell
                    break; 
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            endCol--;
            endRow--;
            startCol++;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printSpiral(matrix);
    }    
}
