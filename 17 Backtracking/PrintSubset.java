public class PrintSubset {

    public static void printSubset(String str,String ans,int i) {
        
        if(i == str.length()){
            System.out.println(ans+" ");
            return;
        }

        // yes choice == mtlb ans me add  hoga
        printSubset(str,ans+str.charAt(i),i+1);

        //no choice == mtlb ans me add nahi hoga
        printSubset(str, ans, i+1);


    }

    public static void main(String[] args) {
        String str = "abc";

        String ans = "";

        printSubset(str,ans,0);
    }    
}
