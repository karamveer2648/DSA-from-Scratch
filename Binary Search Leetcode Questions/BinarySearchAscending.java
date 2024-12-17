public class BinarySearchAscending {
    public static void main(String[] args) {
        // Initialize the array and the target value
        int[] arr = {1, 2, 44, 66, 77, 88};
        int target = 77;

        // Call the binary search function and print the result
        System.out.println("The index value is: " + binaryascending(arr, target));
    }

    // Function to perform binary search on an ascending sorted array
    public static int binaryascending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
