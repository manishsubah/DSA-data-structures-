public class ArrayPairs {
    public static void Parray(int num[]) {
        int count = 0;
        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                // Print each Pair
                System.out.print( "[" + num[i] + "," + num[j] + "]" );
                count++;
            }
        }
        //Numbers of Pairs
        System.out.println();
        System.out.println("Number of Pairs : " + count);
    }
    public static void main(String args[]) {
        int num[] = {12, 5, 27, 28, 16, 29};
        Parray(num);
    }
}
