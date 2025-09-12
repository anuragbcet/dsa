package kunal_k.Hashmap;

import java.util.HashMap;

public class singlenumII {
    public static void main(String[] args) {
        int[] nums={2,2,3,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        

    }
    
}
