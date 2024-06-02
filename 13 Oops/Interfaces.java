public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.walk();

        King k = new King();
        k.walk();
    }    
}

interface ChessPlayer{
    void walk();
}

class Queen implements ChessPlayer{
    public void walk(){
        System.out.println("Queen walk in up,down,left,right and diagonal");
    }
}
class Rook implements ChessPlayer{
    public void walk(){
        System.out.println("Rook walk in up,down");
    }
}
class King implements ChessPlayer{
    public void walk(){
        System.out.println("King walk in up,down,left,right and diagonal by 1 step");
    }
}
