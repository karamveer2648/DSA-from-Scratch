package array;

import java.util.Arrays;
import java.util.Scanner;

public class Multid {
    public static void main(String[] args) {
        int [] [] arr = new int[2] [2];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(arr));
    }   

}
