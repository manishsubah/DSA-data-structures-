class SubArray {
    public static void sArray(int number[]) {
        int sum = 0;
        for(int i=0; i<number.length; i++) {
            int start = i;
            for(int j=i; j<number.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    //Print Sub-Arrays
                    System.out.print(number[k]+" ");
                    // Sum of Sub-Arrays
                    sum = sum + number[k];
                }
                // Print Sum of Sub-Arrays
                System.out.print("Sum= "+sum);
                sum = 0;
                System.out.println();
            }
        }
    }
    public static void main(String args[]) {
        int number[] = {2, 5, 7, 8, 6, 9};
        sArray(number);
    }
}