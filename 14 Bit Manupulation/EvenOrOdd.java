import java.util.Scanner;

public class EvenOrOdd {

    public static void CheckEvenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CheckEvenOrOdd(n);
    }    
}
