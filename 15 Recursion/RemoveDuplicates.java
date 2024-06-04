
public class RemoveDuplicates {

    public static void removeDuplicates(String s,StringBuilder sb,int i,boolean track[]) {
        
        if(i == s.length()) return ;

        if(track[s.charAt(i)-'a'] == true){
            removeDuplicates(s, sb, i+1, track);
        }else{
            track[s.charAt(i)-'a'] = true;
            removeDuplicates(s, sb.append(s.charAt(i)), i+1, track);
        }
    }

   public static void main(String[] args) {
        String s = "aaabbbccd";

        boolean track[] = new boolean[26];
        StringBuilder sb = new StringBuilder("");

        removeDuplicates(s,sb,0,track);

        System.out.println(sb);
   } 
}
