import java.util.*;
public class FindSum {

    public static int findSum(int num1,int num2){
        return num1+num2;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int TotalSum = findSum(a,b);
        System.out.println("Total Sum: "+ TotalSum);
    }
}
