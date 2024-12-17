public class Ceiling {
    public static void main(String[] args) {
        // Example array in descending order
        int [] arr = {14,11,6,5,3,1};
        int target = 0;
        int sort = 0;

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

        // Call the binary search function and print the result
        System.out.println(binary(arr, target, sort));  
    }

    // Binary search function to find the ceiling of the target
    public static int binary(int[] arr, int target, int sort) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index

            if (arr[mid] == target) { // Check if mid element is the target
                return arr[mid];
            }
            if (arr[mid] != target) { // Update temp to the current mid element
                temp = arr[mid];
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
        return temp; // Return the closest element if target is not found
    }
}
