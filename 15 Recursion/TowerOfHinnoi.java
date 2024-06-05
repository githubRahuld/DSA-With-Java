import java.util.Scanner;

public class TowerOfHinnoi {

    public static void towerOfHinnoi(int n,String src,String helper,String des) {
        if(n == 1){
            System.out.println("Transfer disk "+n+" "+"from "+src+" to "+des);
            return ;
        }

        towerOfHinnoi(n-1, src, des, helper);

        System.out.println("Transfer disk "+n+" "+"from "+src+" to "+helper);

        towerOfHinnoi(n-1, helper, src, des);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();


        towerOfHinnoi(n,"A","B","C");
    }
}
