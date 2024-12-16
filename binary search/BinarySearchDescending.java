public class BinarySearchDescending {
    public static void main(String[] args) {
        int[] arr = {88, 77, 66, 33, 21, 11, 5, 3, 2, 1}; // Array in descending order
        int target = 66; // Target value to search for

        // Print the index of the target value in the array
        System.out.println("The index value is: " + binarydescending(arr, target));
    }

    // Method to perform binary search on a descending sorted array
    public static int binarydescending(int[] arr, int target) {
        int start = 0; // Starting index
        int end = arr.length - 1; // Ending index

        // Loop until the start index is less than or equal to the end index
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index

            // If the target is greater than the middle element, search in the left half
            if (target > arr[mid]) {
                end = mid - 1;
            }
            // If the target is less than the middle element, search in the right half
            else if (target < arr[mid]) {
                start = mid + 1;
            }
            // If the target is equal to the middle element, return the middle index
            else if (arr[mid] == target) {
                return mid;
            }
        }
        // Return -1 if the target is not found in the array
        return -1;
    }
}
