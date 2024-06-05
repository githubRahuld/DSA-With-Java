import java.util.Scanner;

public class NumberToStr {

    public static void numberToStr(int n,String nums[]) {
        if(n == 0) return ;

        int digit = n%10;
        n= n/10;
        numberToStr(n, nums);
        System.out.print(nums[digit]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String nums[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        numberToStr(n,nums);
    }
}
