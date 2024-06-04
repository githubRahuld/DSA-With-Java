import java.util.Scanner;

public class SumOfNnum {

    public static int printSumOfNNumbers(int n) {
        if(n == 1) return 1;

        return n+printSumOfNNumbers(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // sum of n natural num
        System.out.println(printSumOfNNumbers(n));
    }    
}
