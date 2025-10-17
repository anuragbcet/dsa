package Algorithm.slidingWindow;

public class maxSubArraysum {
    public static void main(String[] args) {
        int[] arr={1,2,3,8,9,-7,15,-2,10,12};
        int k=3;
        System.out.println(maxSum(arr, k));
    }
    static int maxSum(int[] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int maximum=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            maximum=Math.max(maximum,sum);
        }
        return maximum;
    }
}
