package linearsearch;

import java.util.Arrays;

public class SearchIn2d {
    public static void main(String[] args) {
        int [] [] arr = {{1,2},{3,4}};
        int target = 2;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int [][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}
