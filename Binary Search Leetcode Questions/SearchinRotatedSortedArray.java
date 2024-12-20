public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static int search(int [] nums, int target){

        int pivot =  pivotSearch(nums);

        if(pivot == -1){
            return binarySearch(nums, target, pivot, target);
        }
        if(nums[pivot] ==  target){
            return pivot;
        }
        if(target >= nums[pivot]){
            return binarySearch(nums,0, pivot-1, target);

    }
     return binarySearch(nums, pivot+1,nums.length - 1, target);
    }

    public static int pivotSearch(int [] nums){

        int start = 0;
        int end = nums.length -1;

        while (start <= end){

            int mid = start+(end-start) / 2;

            if(nums[mid] > nums[mid+1]){
                return mid;
            }
            if(nums[mid] < nums[mid+1]){
                return mid+1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
                
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int binarySearch(int [] nums, int start , int end,int target){

        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // Check if the target is greater than the middle element
            if (target > nums[mid]) {
                start = mid + 1;
            }
            // Check if the target is less than the middle element
            else if (target < nums[mid]) {
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