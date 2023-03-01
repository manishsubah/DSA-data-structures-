public class DecimalToBinary {
    public static void decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        int num = decNum;
        while(decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + (remainder * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.print("Decimal to Binary of " + num + " = " + binNum);
    }
    public static void main(String args[]) {
        decToBin(10);
    }
}
