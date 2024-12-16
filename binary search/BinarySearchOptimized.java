public class BinarySearchOptimized {
    public static void main(String[] args) {
        int[] arr = {11, 23, 55, 77, 99, 100};
        int target = 100;
        int sort;

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

        int index = binary(arr, target, sort);
        System.out.println("The index value of target " + target + " is: " + index);
    }

    public static int binary(int[] arr, int target, int sort) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (sort == 1) { // Ascending
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (sort == 2) { // Descending
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }
}
