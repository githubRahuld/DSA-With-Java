public class Abstraction {
    public static void main(String[] args) {
        // Animal horse = new Animal(); cant create abject

        // but can have contructor
       

        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();

        Mustang myHorse = new Mustang();
    }    
}

abstract class Animal{

    Animal(){
        System.out.println("Animal Contructor called...");
    }

    void eat(){
        System.out.println("Animal can eat");
    }

    abstract void walk(); //only declare not define
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse Contructor called...");
    }

    void walk(){
        System.out.println("Horse walk with 4 legs");
    }
}
class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang Contructor called...");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walk with 2 legs");
    }
}