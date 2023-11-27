package binarysearch;

public class SmallestLetter {
    public static void main(String[] args) {
        //You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
        // Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

    }
    static char smallest(char []arr,char target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target < arr[mid]) {
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }     
        }
        // return arr[start%arr.length];
        if (start==arr.length) {
            return arr[0];
        }
        else return arr[start];
    }
}
