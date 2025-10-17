package kunal_k.sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] nums={2,8,49,17,-1,10,89,0};
        int[] arr=sortArr(nums);
        System.out.println(Arrays.toString(arr));
        
    }

    static int[] sortArr(int[] nums){
        if(nums.length==1){
            return nums;
        }

        int mid =nums.length/2;
        int[] left=sortArr(Arrays.copyOfRange(nums, 0,mid));
        int[] right=sortArr(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[left.length+right.length];

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k++]=left[i++];
            }else{
                ans[k++]=right[j++];
            }
        }
        while(i<left.length){
            ans[k++]=left[i++];
        }
        while (j<right.length) {
            ans[k++]=right[j++];
        }
        return ans;
    }
}
