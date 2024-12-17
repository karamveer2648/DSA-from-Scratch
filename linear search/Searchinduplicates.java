import java.util.ArrayList;

public class Searchinduplicates {
    public static void main(String[] args) {
        // Initialize the array with some values
        int arr[] = {1,2,2,3,4,6,7,8,8};
        
        // Define the target value to search for
        int target = 2;
        
        // Call the linear search method and print the result
        System.out.println(linear(arr, target));
    }

    // Method to perform linear search and return indices of target value
    public static ArrayList<Integer> linear(int arr[], int target) {
        // Create an ArrayList to store indices of target value
        ArrayList<Integer> demoarr = new ArrayList<>();
        
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target, add its index to the list
            if (arr[i] == target) {
                demoarr.add(i);
            }
        }
        
        // Return the list of indices
        return demoarr;
    }
}
