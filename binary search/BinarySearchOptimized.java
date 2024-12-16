public class BinarySearchOptimized {
    public static void main(String[] args) {
        int[] arr = {11, 23, 55, 77, 99, 100}; // Sample array
        int target = 100; // Target value to search for
        int sort;

        // Determine if the array is sorted in ascending or descending order
        if (arr[0] < arr[arr.length - 1]) {
            System.out.println("The array is sorted in ascending order");
            sort = 1;
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("The array is sorted in descending order");
            sort = 2;
        } else {
            System.out.println("Error");
            return;
        }

        // Perform binary search
        int index = binary(arr, target, sort);  
        System.out.println("The index value of target " + target + " is: " + index);
    }

    // Binary search function
    public static int binary(int[] arr, int target, int sort) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index

            if (arr[mid] == target) { // Check if mid element is the target
                return mid;
            }

            if (sort == 1) { // Ascending order
                if (target > arr[mid]) {
                    start = mid + 1; // Move right
                } else {
                    end = mid - 1; // Move left
                }
            } else if (sort == 2) { // Descending order
                if (target < arr[mid]) {
                    start = mid + 1; // Move right
                } else {
                    end = mid - 1; // Move left
                }
            }
        }
        return -1; // Target not found
    }
}
