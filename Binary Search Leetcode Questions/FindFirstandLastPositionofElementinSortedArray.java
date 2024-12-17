package Binary Search Leetcode Questions;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;

    }

    public int[] searchRange(int[] nums, int target) {
        
    }

    int binarySearchDouble(int [] nums, int target, boolean findstart)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
