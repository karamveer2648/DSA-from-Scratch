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

        // Loop until the start index is less than or equal to the end index
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // Check if the target is greater than the middle element
            if (target > arr[mid]) {
                start = mid + 1;
            }
            // Check if the target is less than the middle element
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            // Target is equal to the middle element
            else {
                return mid;
            }
        }
        // Target not found in the array
        return -1;
    }
}
