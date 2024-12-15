import java.util.Arrays;

public class TwoArraySearch {
    public static void main(String[] args) {
        
        int [][] arr = {
                        {1,23,4,5,66},
                        {44,55,66,33},
                        {33,22,44}                       
        };

        int target = 55;

        System.out.println(Arrays.toString(search(arr, target)));
        
    }

    public static int[] search(int [][] arr,int target){

        for(int i =0; i < arr.length;i++){
            for(int j=0; j< arr[i].length;j++){
                if (arr[i][j] == target){
                return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
