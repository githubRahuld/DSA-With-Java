public class DiagonalSum {


    public static int diagonalSumOptimise(int matrix[][]){ // O(n)
        int n = matrix.length;

        int sum = 0;

        for(int i = 0;i<n;i++){
            //primary diagonal
            sum += matrix[i][i];

            //secondary diagonal 
            //if i and j are different then only add 
            // if i and j are same means diagonal ele then discard it 
            if( i != n - i - 1){ //( i+j = n-1) => (j = n-i-1)
                sum += matrix[i][n-i-1];
            }
        }

        return sum;

    }

    public static int diagonalSum(int matrix[][]){ //O(n^2)
        int n = matrix.length, m= matrix[0].length;

        int sum = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i == j){
                    sum += matrix[i][j]; 
                }else if(i+j == n-1){

                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSumOptimise(matrix));
    }    
}
