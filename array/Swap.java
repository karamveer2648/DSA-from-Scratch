package array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        Scanner sc = new Scanner(System.in);
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        swap(arr,index1,index2);
        System.out.println(Arrays.toString(arr));
        }

    public static void swap(int [] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
