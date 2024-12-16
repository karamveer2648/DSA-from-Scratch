public class Maxnum {
    public static void main(String[] args) {
        int[] arr = {11, 44, 66, 22, 33, 2233, 33};

        // Find and print the minimum number in the array
        min(arr);

        // Find and print the maximum number in the array
        max(arr);
    }

    // Method to find and print the minimum number in the array
    public static void min(int[] arr) {
        int min = Integer.MAX_VALUE;

        // Iterate through the array to find the minimum number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }

    // Method to find and print the maximum number in the array
    public static void max(int[] arr) {
        int max = Integer.MIN_VALUE;

        // Iterate through the array to find the maximum number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number is " + max);
    }
}
