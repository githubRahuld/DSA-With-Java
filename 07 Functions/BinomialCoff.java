import java.util.Scanner;

public class BinomialCoff {

    public static int Factorial(int n){

        int fact = 1;
        for(int i = 1;i<=n ;i++){
            fact = fact*i;
        }

        return fact;
    }

    public static int findnCr(int n,int r){
        int n_fact = Factorial(n); // n!
        int r_fact = Factorial(r); // r!
        int nmr_fact = Factorial(n-r); // (n-r)!

        int result = n_fact/r_fact*nmr_fact;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int result = findnCr(n,r);

        System.out.println(result);
    }
}
