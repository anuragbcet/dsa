import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = { 9, 9, 9 };
        /*
         * You are given a large integer represented as an integer array digits, where
         * each digits[i] is the ith digit of the integer. The digits are ordered from
         * most significant to least significant in left-to-right order. The large
         * integer does not contain any leading 0's.
         * 
         * Increment the large integer by one and return the resulting array of digits.
         */
        // System.out.println("hello");
        System.out.println(Arrays.toString(plusone2(nums)));
    }
    // static int[] plusone(int[] nums){
    // int num=0;
    // for(int i=0;i<nums.length;i++){
    // num=(num*10)+nums[i];
    // }
    // int requiredNum=num+1;

    // int n=nums.length;
    // int[] arr=new int [nums.length+1];
    // for(int i=0;i<=nums.length;i++){
    // arr[n]=requiredNum%10;
    // requiredNum/=10;
    // n--;
    // }
    // return arr;
    // }

    static int[] plusone2(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 9) {
                count++;
            }
        }
        if (count == nums.length) {
            int[] arr = new int[nums.length + 1];
            arr[0] = 1;
            return arr;
        } else {
            int[] arr = new int[nums.length];
            int num = 0;
            for (int i = 0; i < nums.length; i++) {
                num = (num * 10) + nums[i];
            }
            int requiredNum = num + 1;

            int n = nums.length - 1;
            // int[] arr=new int [nums.length+1];
            for (int i = 0; i < nums.length; i++) {
                arr[n] = requiredNum % 10;
                requiredNum /= 10;
                n--;
            }
            return arr;

        }
    }

    static int[] plusone3(int[] digits) {
        int count = 0;
        for (int i : digits) {
            if (i == 9) {
                count++;
            }
        }
        if (count == digits.length) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        } else if (digits[digits.length - 1] == 0) {
            digits[digits.length - 1] = 1;
            return digits;
        } else {
            int[] arr = new int[digits.length];
            int num = 0;
            for (int i = 0; i < digits.length; i++) {
                num = (num * 10) + digits[i];
            }
            int requiredNum = num + 1;

            int n = digits.length - 1;
            // int[] arr=new int [nums.length+1];
            for (int i = 0; i < digits.length; i++) {
                arr[n] = requiredNum % 10;
                requiredNum /= 10;
                n--;
            }
            return arr;

        }
    }

    // final solution
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newdigits = new int[digits.length + 1];
        newdigits[0] = 1;
        return newdigits;

    }

}
