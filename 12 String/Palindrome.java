import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(String s){
        
        int n = s.length();

        for(int i = 0 ;i<s.length()/2;i++){ //check for half of length of string
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(checkPalindrome(s));
    }    
}
