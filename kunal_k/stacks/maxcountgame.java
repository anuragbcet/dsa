package kunal_k.stacks;

import java.util.Stack;

public class maxcountgame {
    public static void main(String[] args) {
        
    }
    static int maxcount(int max,Stack s1,Stack s2,int sum ,int count){
        if(sum>=max){
            return count;
        }

        // maxcount(max, s1.pop(), s2, sum, count);
        // maxcount(max, s1, s2.pop(), sum, count);
        return 0;
    }
    
}
