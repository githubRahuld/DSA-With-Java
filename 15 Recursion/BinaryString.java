import java.util.Scanner;

public class BinaryString {

    public static void printBinaryStrings(int n,int lastPlace,String s) {
        if(n == 0){
           System.out.println(s);
           return;
        }

        if(lastPlace == 0){
            //if last place == 0 then we can add 0 or 1
            printBinaryStrings(n-1, 0, s+"0"); // 0
            printBinaryStrings(n-1, 1, s+"1"); // 1
        }else{
            //if last place pe 1 hai to h we only add 0
            printBinaryStrings(n-1, 0, s+"0");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        printBinaryStrings(n,0,"");
    }    
}
