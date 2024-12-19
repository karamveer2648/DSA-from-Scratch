
/**
 * This class contains a method to find a peak element in an array.
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * Problem link: https://leetcode.com/problems/find-peak-element/
 * 
 * The findPeakElement method uses a binary search approach to find a peak element.
 * 
 * The algorithm works as follows:
 * 1. Initialize two pointers, start and end, to the beginning and end of the array.
 * 2. While start is less than end:
 *    a. Calculate the mid index.
 *    b. If the element at mid is greater than the element at mid + 1, 
 *       then the peak element is in the left half, so move the end pointer to mid.
 *    c. Otherwise, the peak element is in the right half, so move the start pointer to mid + 1.
 * 3. When start equals end, the peak element is found, and the index is returned.
 * 
 * @param nums the input array of integers
 * @return the index of a peak element
 */
public class FindPeakElement {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));

    }

    public static int findPeakElement(int[] nums){

        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            
            int mid = start + (end-start) / 2;

            if(nums[mid] > nums[mid + 1]){

                end = mid;
            }
            else {

                start = mid + 1;
            }

        }
        return start;
    }
}
