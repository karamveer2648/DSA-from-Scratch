
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        
        int [] arr = new int[5];
        arr[0] = 2;

        //for loop for input 
        for(int i=0; i < arr.length;i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        
        }

        //for printing full arrray 

        for(int i = 0; i < arr.length;i ++){
            System.out.print(arr[i]+",");
        }
    }   
}
