import java.util.Scanner;

public class Print1ToN {

    public static void print1ToN(int n) {

        if(n == 1){
            System.out.println(1);
            return;
        }
        print1ToN(n-1);

        System.out.println(n+" ");

    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //print 1 to n in incresing order
        print1ToN(n);
    }    
}
