public class PrintSubstring {

    public static String printSubstring(String s,int st,int en){

        String substr = "";

        for(int i = st;i<en;i++){
            substr += s.charAt(i);
        }

        return substr;
    }

    public static void main(String[] args) {
        String s = "HelloWorld";

        System.out.println(printSubstring(s,0,5));

        // using inbuild function 'substring'
        System.out.println(s.substring(0,5));
    }    
}
