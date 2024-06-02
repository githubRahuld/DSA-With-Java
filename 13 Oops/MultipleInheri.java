public class MultipleInheri {
    public static void main(String[] args) {
        Beer beer = new Beer();
        beer.eatGrass();
        beer.eatMeat();
    }    
}

interface Herbivorous{
    void eatGrass();
}

interface Carnivorous{
    void eatMeat();
}

//mutliple inheritance
class Beer implements Herbivorous , Carnivorous{
    public void eatGrass(){
        System.out.println("Beer eats grass");
    }
    public void eatMeat(){
        System.out.println("Beer eats meat also.");
    }
}
