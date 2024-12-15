package linear search;

public class Stringsearch {
    
    public static void main(String[] args) {
        
        String str = "Karam";
        char target = 'm';
        boolean ans = searchstring(str, target);
        System.out.println(ans);
        int answer = searchstringindex(str,target);


    }

    public static boolean searchstring(String str, char target){

        if (str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length();i++){

            if (target == str.charAt(i)){
                return true;
            }
        }
       return false; 
    }

    public static int searchstringindex(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.lenght(); i++){
        
        
        }
    }
}
