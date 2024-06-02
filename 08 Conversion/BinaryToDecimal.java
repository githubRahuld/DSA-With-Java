public class BinaryToDecimal {

   
    public static int binaryToDecimal(int binNum){

        int decNum = 0;
        int pow = 0;

        while(binNum>0){
            int digit = binNum%10;
            decNum = decNum + digit * (int)Math.pow(2,pow);

            pow++;
            binNum = binNum/10;
        }

        return decNum;
    }
    public static void main(String[] args) {
        int binNum = 10101;

        System.out.println(binaryToDecimal(binNum));
    }
}
