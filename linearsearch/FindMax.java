package linearsearch;

public class FindMax {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,9,5};
        System.out.println(maximum(arr));
        
    }
    static int maximum(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
    return max;
    }
}
