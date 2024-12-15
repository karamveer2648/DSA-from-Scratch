
public class Findnumberwithevennumbersofdigit {
    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};

        int test = findNumbers(nums);
        System.out.println(test);
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        int pointer=     0;
        for(int num:nums){
            while(num > 0){
                num = num / 10;
                count++;

            }
        if(num % 2 == 0){
            pointer++;
        }


        
        }
        return count;
    
    }



}
