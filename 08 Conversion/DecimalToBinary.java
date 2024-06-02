public class DecimalToBinary {

    public static void decimalToBinary(int deciNum){
        int n = deciNum;
        int binaryNum = 0;
        int pow = 0;

        while(deciNum > 0){
            int rem = deciNum%2;

            // result = result + rem * 10^pow
            binaryNum = binaryNum + rem*(int)Math.pow(10,pow);
            pow++;

            deciNum = deciNum/2;
        }
        System.out.println("Binary form of "+ n+ ": "+binaryNum);
     
    }

    public static void main(String[] args) {
        int deciNum = 11;

        decimalToBinary(deciNum);
  
    }    
}
