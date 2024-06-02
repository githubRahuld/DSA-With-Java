public class Inheritance {
    public static void main(String[] args) {
        // Fish machli = new Fish();

        // machli.breath();

        Dog dobby = new Dog();
        dobby.eat();
    }    
}
// //single level
// class Animal{
//     String color;
//     String bread;

//     void speak(){
//         System.out.println("Animal can speak");
//     }

//     void breath(){
//         System.out.println("Animal will breath");
//     }
// }

// class Fish extends Animal{
//     int fin;

//     void setFin(int fin){
//         this.fin = fin;
//     }

//     int getFin(){
//         return this.fin;
//     }

// }

//multi level
class Animal{
    String color;
    String bread;

    void eat(){
        System.out.println("Animal can eat");
    }

    void breath(){
        System.out.println("Animal will breath");
    }
}

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String breed;
}
