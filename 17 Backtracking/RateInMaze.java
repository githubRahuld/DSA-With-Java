public class RateInMaze {

    public static boolean isSafe(int maze[][],int i ,int j) {
        if((i>=0 && i<maze.length) && (j>=0 && j<maze[0].length) && maze[i][j] == 1){
            return true;
        }
        return false;
    }

    public static boolean ratInMaze(int maze[][],int i,int j,int solArr[][]) {
        
        if(i == maze.length-1 && j == maze[0].length-1){ //base case
            solArr[i][j] = 1;
            return true;
        }

        if(isSafe(maze,i,j)){
            solArr[i][j] = 1;

            if(ratInMaze(maze, i+1, j, solArr)){ //down
                return true;
            }
            if(ratInMaze(maze, i, j+1, solArr)){// right
                return true;
            }

            solArr[i][j] = 0 ; //backtrack
            return false;

        }

        return false;

    }

    public static void printArr(int solArr[][]) {
        for(int i = 0;i<solArr.length;i++){
            for(int j = 0;j<solArr[0].length;j++){
                System.out.print(solArr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };

        
        int n = maze.length;
        int m = maze[0].length;

        int solArr[][] = new int[n][m];
        if(ratInMaze(maze,0,0,solArr)){
            System.out.println("Solution exists");
            printArr(solArr);
        }else{
            System.out.println("Solution doesnot exist");
        }
    }    
}
