public class SingleNumber {
    // leetcode question number 136.
    // Single number
    /*
     * Given a non-empty array of integers nums, every element appears twice except
     * for one. Find that single one.
     * 
     * You must implement a solution with a linear runtime complexity and use only
     * constant extra space.
     */

    public static void main(String[] args) {
        int [] nums={4,5,1,2,1,2,4};
        System.out.println(single(nums));

    }
    static int single(int[] nums){
        int n=nums.length;
        int count=0;
        int j=0;
        while(j<=n){
            for(int i=0;i<n;i++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            // System.out.println(count);
            if(count==1){
                return nums[j];
            }
            count=0;
            j++;
        }
        
        return -1;
    }
    
    // static int singleAppear(int[]nums){
    //     int n=nums.length;
    //     int i=0;
    //     int j=0;
    //     while(j<n){
            
    //     }
    // }

}
