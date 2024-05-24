public class LargestOf3Num {
    public static void main(String[] args) {
        int a= 10;
        int b = 220;
        int c = 34;

        if(a >= b && a >= c){
            System.out.println("A is greatest");
        }else if(b >= c){
            System.out.println("B is greatest");
        }else{
            System.out.println("C is greatest");
        }
    }
}
