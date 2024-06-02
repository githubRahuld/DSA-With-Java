import java.util.Scanner;

public class SmallestLargest {

    public static void smallestLargest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        int n = matrix.length, m = matrix[0].length;

        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }

                if(matrix[i][j] < smallest){
                    smallest= matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element in matrix: "+ smallest);
        System.out.println("Largest element in matrix: "+ largest);
    }

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        int matrix[][] = new int[3][3];

        int n = matrix.length, m = matrix[0].length;
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        smallestLargest(matrix);
    }    
}
