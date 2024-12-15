
public class Search {
    public static void main(String[] args) {
        int [] arr = {23,34,55,66,77,22,44,22};
        int target = 22;
        int ans = linearsearch(arr, target);
        System.out.println(ans);

    }   

    public static int linearsearch(int arr[],int target){
        int count = 0;
        if (arr.length == 0){
            return -1;
        }

        for(int i = 0 ; i < arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1; // return -1 if target is not found
    }
 

