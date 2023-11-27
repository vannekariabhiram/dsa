package linearsearch;

public class EvenDigits {
    public static void main(String[] args) {
        //Given an array nums of integers, return how many of them contain an even number of digits.
        int [] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int []arr){
        int count=0;
        for (int i : arr) {
           if (even(i)) {
             count++;
           }
        }
        return count;
    }
     static boolean even(int i) {
        int number=count(i);
      return number%2==0;
    }
    static int count(int num){
        if (num<0) {
            num=num*-1;
        }
         if (num==0) {
           return 1;
        }
        // int count =0;
        // while (num>0) {
        //     count++;
        //     num=num/10;
        //  }
        //  return count;
        String s = Integer.toString(num);
        return s.length();
        }
}
