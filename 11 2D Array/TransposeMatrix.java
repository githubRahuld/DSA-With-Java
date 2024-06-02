public class TransposeMatrix {

    public static void transposeMatrix(int matrix[][]){
        int n = matrix.length, m = matrix[0].length;

        int transpose[][] = new int[m][n]; // create new matrix of m x n size

        for(int i = 0;i<n;i++){
            for(int j = 0;j<matrix[0].length;j++){
                transpose[j][i]  = matrix[i][j];
            }
        }

        //print transpose matrix
        for(int i = 0 ;i<transpose.length;i++){
            for(int j = 0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8}};

        transposeMatrix(matrix);
    }    
}
