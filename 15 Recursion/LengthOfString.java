public class LengthOfString {

    public static int printLength(String s) {
        if(s.length() == 0){
           return 0;
        }

        return printLength(s.substring(1))+1;
    }

    public static void main(String[] args) {
        String s = "Rahul";
        
       System.out.println(printLength(s));
    }
}
