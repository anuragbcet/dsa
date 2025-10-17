package mediumQues;

import java.util.ArrayList;
import java.util.List;

public class Superset {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> sets(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                List<Integer> arr=new ArrayList<>();
                for(int k=j;k<nums.length;k++){
                    arr.add(nums[i]);
                }
                 ans.add(arr);
            }
           
        }
        return ans;
    }
    
}
