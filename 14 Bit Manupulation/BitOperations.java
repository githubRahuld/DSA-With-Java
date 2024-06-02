import java.math.BigInteger;

public class BitOperations {

    public static int getBit(int n,int pos){

        if((n & (1<<pos)) == 0 ){
            return 0;
        }
        
        return 1;

    }
    public static int setBit(int n,int pos){

        n = (n | (1<<pos));
        
        return n;

    }
    public static int clearBit(int n,int pos){

        int bitMask = ~(1<<pos);
        bitMask = n & bitMask;

        return n & bitMask;

    }
    public static int updateBit(int n,int pos,int newBit){

        if(newBit == 0){
            return clearBit(n, pos);
        }else{
            return setBit(n, pos);
        }

    }
    public static int clear_N_Bits(int n,int i){

        int bitMask = (~0)<<i;

        return n & bitMask;

    }

    public static void main(String[] args) {
        int n = 1010111001;

        System.out.println(getBit(n,3));
        
        System.out.println(setBit(10,2));

        System.out.println(clearBit(10,1));


        System.out.println(updateBit(10,2,1));

        System.out.println(clear_N_Bits(15,2));

       

    }    
}
