public class Logical {
    public static void main(String[] args) {
        // like:  && , || , !

        int a = 10;
        int b = 20;

        boolean isLoggedIn = true;

        System.out.println((a < b) && isLoggedIn );
        System.out.println((a > b) && isLoggedIn);
        System.out.println(!isLoggedIn);
        System.out.println((a > b) || isLoggedIn);
       
        
    }    
}
