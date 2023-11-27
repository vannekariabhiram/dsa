package linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(minimum(arr));
        
    }
    static int minimum(int []arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                arr[i]=min;
            }
        }
        return min;
    }
}
