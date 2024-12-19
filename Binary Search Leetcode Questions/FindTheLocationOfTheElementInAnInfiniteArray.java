
public class FindTheLocationOfTheElementInAnInfiniteArray {

    public static void main(String[] args) {
     
        
        int [] arr = {2,5,6,7,8,12,14,15,32,33,34};
        int target = 34;
       System.out.println(search(arr, target));
    }
       
     static int search(int [] arr, int target){

        int start =0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            start = end;



            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
     }    
    public static int binarySearch(int [] arr, int target, int start, int end){

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
