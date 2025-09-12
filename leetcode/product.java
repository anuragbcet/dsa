package leetcode;

import java.util.Arrays;

public class product {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int[] ans=productOfall(nums);
        System.out.println(Arrays.toString(ans));

    }
    //Return the answer array which contains the product of all the elements except itself ;
    static int[] productOfall(int[] nums){
        int[] prefix=new int [nums.length];
        int[] postfix=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                prefix[i]=1;
            }
            else{
                prefix[i]=nums[i-1]*prefix[i-1];
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){
                postfix[j]=1;
            }else{
                postfix[j]=nums[j+1]*postfix[j+1];
            }
        }
        int[] ans=new int[nums.length];

        for(int k=0;k<nums.length;k++){
            ans[k]=prefix[k]*postfix[k];
        }
        return ans;
    }
}
