import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        int tax = 0;

        if(income < 500000){
            tax = 0; //0 tax
        }else if(income >= 500000 && income < 1000000){
            tax = (int)(income * 0.2); //20% tax
        }else {
            tax = (int)(income * 0.3) ; // 30% tax
        }

        System.out.println("Total Tax: "+ tax);
    }

}
