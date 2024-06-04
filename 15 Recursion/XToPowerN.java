public class XToPowerN {

    //optimise
    public static int optimisePower(int x,int n){
        if(n == 0) return 1;

        // int halfpower = optimisePower(x, n/2) * optimisePower(x, n/2);

        int halfpower = optimisePower(x, n/2);
        int halfpowerSq = halfpower * halfpower;

        if(n % 2 != 0) { //odd power
            halfpowerSq = x * halfpowerSq;
        }

        return halfpowerSq;

    }

    public static int findXToPowerN(int x,int n) {
        if(n == 0) return 1;

        return x*findXToPowerN(x, n-1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;   
        
        // x^(n)  :- 2^(10)

        System.out.println(findXToPowerN(x,n));  // O(n)
        
        System.out.println(optimisePower(x,n)); // O(logn)

    }    
}
