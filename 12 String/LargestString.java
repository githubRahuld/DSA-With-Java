public class LargestString {

    public static String largestString(String fruits[]){

        String largest = fruits[0];

        for(int i = 1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana","kiwi","strawberry"};

        System.out.println(largestString(fruits));

        //compareTo method compare each word of string 
        // s1.compareTo(s2) == 0 means both are equal
        // s1.compareTo(s2) < 0 means s1<s2
        // s1.compareTo(s2) > 0 means s1>s2

        //! compareToIgnoreCase method treat 'A' and 'a' as same

        //! why strings are immutable
        String str1= "Tony";
        System.out.println(str1);

        str1 = "Rahul";
        System.out.println(str1);

        // strings are immutable bcs it does not replace the string instead of it created new space for that string and point to new location; 

        // to solve this problem we use StringBuilder it doesnot create new string every time instead of it change the previous value with new value
    }    
}
