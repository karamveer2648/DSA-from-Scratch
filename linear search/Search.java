public class Search {
    public static void main(String[] args) {
        int[] arr = {23, 34, 55, 66, 77, 22, 44, 22}; // Array to search in
        int target = 22; // Target value to search for
        int ans = linearsearch(arr, target); // Perform linear search
        System.out.println(ans); // Print the result
    }

    // Method to perform linear search
    public static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // Return -1 if array is empty
        }

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
}
