class BinarySearch {
    public static int binary(int num[], int key) {
        int start = 0;
        int last = num.length;
        while(start<last) {
            int mid = (start+last)/2;
            if(num[mid] == key) {
                return mid;
            }
            if(num[mid]<key) {
                start = mid+1;
            } else {
                last = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num[] = {2,22,44,55,57,58,78,88,102,125};
        int key = 2;
        System.out.println("The Index : "+binary(num, key));
        
    }
}