public class ArrayReverse {
    public static void reverseArray(int number[]) {
        int first = 0, last = number.length-1;
        while(first < last) {
            // SWAP the Array
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }

    }
    public static void display(int number[]) {
        // Print the array
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
    public static void main(String args[]) {
        int number[] = {2, 5, 7, 8, 6, 9};
        reverseArray(number);
        display(number);
    }
}
