public class BinaryDecimal {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int num = binNum;
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("Binary of Decimal of " + num + " = " + decNum);
    }
    public static void main(String args[]) {
        binToDec(1010); // OUTPUT = 10
    }
}
