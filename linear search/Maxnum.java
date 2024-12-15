
public class Maxnum {
    public static void main(String[] args) {
        int [] arr = {11,44,66,22,33,2233,33};

        min(arr);
        max(arr);
    }

    public static void min(int [] arr){
        int min = Integer.MAX_VALUE;


        for(int i=0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println("Minimum number is "+min);
    } 
    public static void max(int [] arr){
        int max = Integer.MIN_VALUE;


        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }
        System.out.println("Maximum number is "+max);
    }
}
