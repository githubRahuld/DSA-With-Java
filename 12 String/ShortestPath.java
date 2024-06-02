public class ShortestPath {

    public static float shortestPath(String path){

        int x = 0;
        int y = 0;

        for(int i = 0;i<path.length();i++){
            char dir = path.charAt(i);

            // North
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else{
                //Eest
                x++;
            }
        }
        // now apply shortest path formula

        int X = x*x;
        int Y = y*y;
       
        return (float)Math.sqrt(X+Y);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(shortestPath(path));
    }    
}
