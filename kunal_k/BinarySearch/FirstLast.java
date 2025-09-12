package kunal_k.BinarySearch;

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int[] arr ={2,3,7,7,7,8,9,9};
        int target = 9;
        System.out.println(Arrays.toString(fisrtlast(arr, target)));

    }

    static int[] fisrtlast(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                end=mid-1;
            }
        }
        return new int[] {-1,-1};

    }
}
