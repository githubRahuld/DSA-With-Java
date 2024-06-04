import java.util.Scanner;

public class PrintNto1 {

    public static void printNTo1(int n){
        if(n == 1){
            System.out.println(1);
            return ;
        } 
        System.out.println(n+" ");

        printNTo1(n-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //print 1 to n in decresing order
        printNTo1(n);
    }    
}
