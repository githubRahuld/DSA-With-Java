public class Arithemetic {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Binary operators(2 oprands)
        //like:  + - * / %
        System.out.println("add: "+ (a+b));
        System.out.println("sub: "+ (a-b));
        System.out.println("multi: "+ (a*b));
        System.out.println("divide: "+ (a/b));
        System.out.println("modulo: "+ (a%b));


        // unary operatos(1 oprand) 
        //ex:  a++, ++a, a--, --a
        int x = 10;
        int y = ++x; // pre increment means first value increment then inialise

        System.out.println(x);
        System.out.println(y);

        int num1 = 1;
        int num2 = num1++;  // post increment means first value inialise then increment

        System.out.println(num1);
        System.out.println(num2);

        // same with decrement operator
    }
}
