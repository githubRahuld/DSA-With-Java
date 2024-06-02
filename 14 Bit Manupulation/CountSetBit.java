public class CountSetBit {

    // O(logn+1)
    //ex :- n=16  log(14)+1 =  5 bits  ,16 represent in 5 bits
    public static int countSetBit(int n){
        
        int count = 0;
        while(n > 0){
            if((n & 1 )!= 0){ //check LSB
                count++;
            }

            //right shift by 1 pos
            n = n>>1;
        }

        return count;
    }

    public static void main(String[] args) {
        int n ;

       System.out.println( countSetBit(15)); //4
    }    
}
