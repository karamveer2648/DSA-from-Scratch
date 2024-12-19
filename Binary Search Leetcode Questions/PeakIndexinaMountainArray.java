// Link to the problem: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakIndexinaMountainArray {
    public static void main(String[] args) {
        int [] arr = {0,1,0};
        // Test the peakIndexInMountainArray function with a sample array
        System.out.println(peakIndexInMountainArray(arr));
    }

    // Function to find the peak index in a mountain array
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Loop until the start index is less than the end index
        while (start < end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // If the middle element is greater than the next element, the peak is on the left side
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } 
            // If the middle element is less than or equal to the next element, the peak is on the right side
            else {
                start = mid + 1;
            }
        }
        // Return the peak index
        return start;
    }
}
