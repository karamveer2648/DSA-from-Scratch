
public class Maxitems {
    public static void main(String[] args) {
        int[] arr = {1, 44, 66, 7, 88};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}
