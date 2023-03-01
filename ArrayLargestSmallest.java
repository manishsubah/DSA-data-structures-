public class ArrayLargestSmallest {
    public static void Operations(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        // find largest and smallest 
        for(int i=0; i<num.length; i++) {
            if(largest < num[i]) {
                largest = num[i];
            }
            if(smallest > num[i]) {
                smallest = num[i];
            }
        }
        // Print the Largest and Smallest number in the array
        System.out.println("Largest Number : " + largest);
        System.out.println("Smallest Number : " + smallest);
    }
    public static void main(String args[]) {
        int num[] = {12, 5, 27, 28, 16, 29};
        Operations(num);
    }
}
