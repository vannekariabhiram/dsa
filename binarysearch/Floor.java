package binarysearch;

public class Floor {
    public static void main(String[] args) {
     //floor of a number means greatest  element smaller than or equal to target element
     int [] arr={2,4,6,8,10};
     int target = 5;
     System.out.println(binarysearch(arr, target));
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }
            else if(target>arr[mid]) {
               start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
