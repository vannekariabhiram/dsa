package linearsearch;

import java.util.Arrays;

public class FindMaxIn2d{
    public static void main(String[] args) {
        int [] [] arr = {{1,2},{3,4}};
        int target = 2;
        System.out.println((search(arr)));
    }
    static int search(int [][]arr){
        int max=Integer.MIN_VALUE;
        for (int[] is : arr) {
            for (int is2 : is) {
                if (is2>max) {
                    max=is2;
                }
            }
            
        }
        return max;
    }
}
