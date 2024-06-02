import java.util.Scanner;

public class TwoPowerNum {

    public static boolean isTwoPower(int n ){

        //any number which which  give  (n & n-1)==0  then it is in two ki power
        if((n & n-1) == 0){
            return true; // num is in 2^pow
        }

        return false; // not
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       System.out.println(isTwoPower(n));
    }    
}
