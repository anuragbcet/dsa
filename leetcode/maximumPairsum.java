package leetcode;

import java.util.HashMap;

public class maximumPairsum {
    public static void main(String[] args) {
        int [] arr={10,25,52,15,97};
        System.out.println(largestSum(arr));
    }
    static int largestSum(int[] arr){
        //using hashMap
        HashMap<Integer,Integer> map=new HashMap<>();
        int largestsum=-1;
        for(int i=0;i<arr.length;i++){
            int num1=arr[i];
            int sum1=sumofdigits(num1);
            if(map.containsKey(sum1)){
                largestsum=Math.max(largestsum,num1+map.get(sum1));
            }
            map.put(sum1,num1);
        }
        return largestsum;
    }
    // static int largestSum(int [] arr){
    //     int largestsum=-1;
    //     for(int i=0;i<arr.length;i++){
    //         int num=arr[i];
    //         int sum=sumofdigits(num);
    //         for(int j=i+1;j<arr.length;j++){
    //             int num2=arr[j];
    //             int sum2=sumofdigits(num2);
    //             if(sum==sum2){
    //                 largestsum=Math.max(largestsum,num+num2);
    //             }
    //         }
    //     }
    //     return largestsum;
    // }
    static int sumofdigits(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
}
