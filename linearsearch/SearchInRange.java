package linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       int target =3;
       System.out.println(search(arr, target,0,2));
    }
    static int search (int[]arr ,int target,int start,int end){
        if (arr.length==0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target==arr[i]) {
                return i;
            } 

        }
        // for (char s: str.toCharArray()) {
        //     if (s==target) {
        //         return true;
        //     }
        // }
    return -1;
}
}
