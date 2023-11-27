package linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String name="abhi";
        char c = 'u';
    }
    static boolean search (String str ,char target){
        if (str.length()==0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)) {
                return true;
            } 

        }
        // for (char s: str.toCharArray()) {
        //     if (s==target) {
        //         return true;
        //     }
        // }
    return false;
}
}
