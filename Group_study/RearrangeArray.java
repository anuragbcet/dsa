import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int [] arr={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrange(arr)));

    }

    static int[] rearrange(int[] nums){
        int n=nums.length;
        int [] arr= new int [n];
        int positivepointer=0;
        int negativepointer=1;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                arr[positivepointer]=nums[i];
                positivepointer=positivepointer+2;
            }
            if(nums[i]<0){
                arr[negativepointer]=nums[i];
                negativepointer=negativepointer+2;
            }
        }
        return arr;
    }
}
