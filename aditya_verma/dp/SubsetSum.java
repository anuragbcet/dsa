package aditya_verma.dp;

public class SubsetSum {
    public static void main(String[] args) {
        // given an array and i have to find out a sub array with sum equal to the
        // target ,if the subset found return true , otherwise return false.
        int[] arr={1,3,5,6,9,8};
        int target=12;
        System.out.println(targetSum(arr, target));
    }
    static boolean targetSum(int[] arr,int sum){
        int n=arr.length;
        boolean[][] t=new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j]=false;
                }
                if(j==0){
                    t[i][j]=true;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }

            }
        }
        return t[n][sum];

    }

}
