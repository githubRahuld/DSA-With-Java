import java.util.Scanner;

public class basic {

    public static void incrementMarks(int marks[],int num){
        for(int i = 0;i<marks.length;i++){
            marks[i] += 1;
        }

        num = num+1;
    }

    public static void main(String[] args) {
        int marks[] = new int[3];
        int num = 10;

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            marks[i] = sc.nextInt();
        }

        incrementMarks(marks,num);

        for(int i = 0 ;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println(num);
    }
}
