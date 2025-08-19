package leetcode;

import java.util.Stack;

public class lt1323 {
    public static void main(String[] args) {
        // 1323. Maximum 69 Number
        // Easy
        // Topics
        // premium lock iconCompanies
        // Hint

        // You are given a positive integer num consisting only of digits 6 and 9.

        // Return the maximum number you can get by changing at most one digit (6
        // becomes 9, and 9 becomes 6).

        // Example 1:

        // Input: num = 9669
        // Output: 9969
        // Explanation:
        // Changing the first digit results in 6669.
        // Changing the second digit results in 9969.
        // Changing the third digit results in 9699.
        // Changing the fourth digit results in 9666.
        // The maximum number is 9969.
        int num=9669;
        System.out.println("maximum number :"+ maximum69integer(num));


    }
    static int maximum69integer(int num){
        // if(num==null) return 0;
        int maxnum=0;
        Stack<Integer> s= new Stack<>();
        Boolean firstBoolean=true;
        while(num>0){
            int digit=num%10;
            s.push(digit);
            num=num/10;
        }
       
        while(!s.isEmpty()){
            if(s.peek()==9){
                maxnum=(maxnum*10)+s.pop();
            }
            else{
                if(firstBoolean){
                    s.pop();
                    maxnum=(maxnum*10)+9;
                    firstBoolean=false;
                }
                maxnum=(maxnum*10)+s.pop();
            }
        }
        return maxnum;
    }

}
