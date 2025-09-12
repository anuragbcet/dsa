package leetcode;

import java.util.HashSet;

public class longestSubsequence {
    public static void main(String[] args) {
        int[] arr={1,9,6,15,5,2,4,7,8};
        System.out.println(subsequence(arr));
        
    }

    static int subsequence(int[] arr){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int longestSub=1;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]-1)){
                continue;
            }else{
                int currentNum=arr[i];
                int currentSub=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                longestSub=Math.max(currentSub,longestSub);
            }
        }
        return longestSub;
    }
    
}
