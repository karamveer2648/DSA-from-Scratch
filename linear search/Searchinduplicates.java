
import java.util.ArrayList;


public class Searchinduplicates {
    public static void main(String[] args) {
        
        int arr[] = {223,33,11,223344,55667,88,66,11};
        
        int target = 200;
        System.out.println(linear(arr,target));
    }
public static ArrayList<Integer> linear(int arr[],int target){
    ArrayList<Integer> demoarr = new ArrayList<>();
    for(int i=0; i < arr.length;i++){
        if(arr[i]==target){
            demoarr.add(i);
        }   
    
    }
    return demoarr;
}
}
