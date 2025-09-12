package leetcode;

import java.util.Arrays;

public class swapChar {
    public static void main(String[] args) {
        String s="Anurag";
        String swapped=swap(s, 0, 3);
        System.out.println(swapped);
    }
    static String swap(String s, int first, int second){
        char[] arr = s.toCharArray();
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return new String(arr);
    }
    
}
