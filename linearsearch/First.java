package linearsearch;

public class First {
    public static void main(String[] args) {
     
        //basic searching algorithm 
   int [] arr={18,12,9,14,77,50};
   //find whether 14 exists in array or not
   //algorithm says start searching from starting element till you find the element
   //Time complexity  = o(n) 
 
 System.out.println(linear(arr,9));
    }
    static int linear(int[]arr,int target ){
        if (arr.length==0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return i;
            }
        }

    return -1;
   }
}
