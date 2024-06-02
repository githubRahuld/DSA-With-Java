import java.util.Arrays;

public class FirstLetterCapital {

    public static StringBuilder toUpperCase(String s){

        StringBuilder sb = new StringBuilder("");

        // make first letter to uppercase and append to sb
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i = 1;i<s.length();i++){
            
            if(s.charAt(i) == ' ' && i<s.length()){
                sb.append(" "); //add space 
                i++;
                ch = Character.toUpperCase(s.charAt(i)); //change to uppercase 
                sb.append(ch);
            }else{
                sb.append(s.charAt(i)); //for normal letter
            }
        }

        return sb;
    }

    public static void main(String[] args) {
        String s = "my name is rahul";

        System.out.println(toUpperCase(s));

        String name = "Rahul";
        name = name.toLowerCase();

        char[] newName = name.toCharArray();
        

        Arrays.sort(newName);

        System.out.println(newName);
     }    
}
