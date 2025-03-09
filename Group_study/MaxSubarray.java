public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(sum2(arr));
    }

    // static int sum(int[] nums){
    // int sum =0;
    // int n=nums.length;
    // int i=0;
    // while(i<n){
    // sum=sum+nums[i];
    // if(sum<0){
    // sum=0;
    // i++;
    // }
    // i++;
    // }

    // return sum;
    // }
    static int sum2(int[] nums) {
        int n = nums.length;
        int maxsum = nums[0];
        for (int i = 0; i < n; i++) {
            int currentsum = 0;
            for (int j = i; j < n; j++) {
                currentsum += nums[j];
                maxsum = Math.max(currentsum ,maxsum);
            }
            
        }

        return maxsum;
    }
}
