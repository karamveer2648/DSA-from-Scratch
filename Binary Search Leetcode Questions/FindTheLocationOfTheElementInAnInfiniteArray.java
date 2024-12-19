
/**
 * The FindTheLocationOfTheElementInAnInfiniteArray class provides a method to find the location of a target element
 * in an infinite sorted array. Since the array is considered infinite, the length is not known in advance.
 * The search is performed using a combination of exponential search to find the range where the target might be,
 * followed by binary search within that range.
 */
public class FindTheLocationOfTheElementInAnInfiniteArray {

    public static void main(String[] args) {
        // Example usage of the search method
        int[] arr = {2, 5, 6, 7, 8, 12, 14, 15, 32, 33, 34};
        int target = 34;
        System.out.println(search(arr, target));
    }

    /**
     * Searches for the target element in an infinite sorted array.
     *
     * @param arr    the infinite sorted array
     * @param target the target element to search for
     * @return the index of the target element if found, otherwise -1
     */
    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the range exponentially until the target is within the range
        while (target > arr[end]) {
            int temp = end + 1;
            start = end;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    /**
     * Performs binary search on the given array within the specified range.
     *
     * @param arr    the array to search in
     * @param target the target element to search for
     * @param start  the starting index of the range
     * @param end    the ending index of the range
     * @return the index of the target element if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target, int start, int end) {
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
