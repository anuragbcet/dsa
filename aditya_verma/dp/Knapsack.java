package aditya_verma.dp;

import java.util.Arrays;

public class Knapsack {
    // Here i am writing the soution of 0-1 knapsack problem ,
    // In which the profit needs to be maximum;

    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int w = 7;
        int n = wt.length;
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++)
            Arrays.fill(dp[i], -1);

        int profit = knapsack(wt, val, w, n,dp);
        System.out.println("Maximum profit = " + profit);

    }
    // Recurssive solution + Memoization;

    static int knapsack(int[] wt, int[] val, int w, int n,int[][]dp) {
        if (n == 0 || w == 0) {
            return dp[n][w]=0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if (wt[n - 1] <= w) {
            return dp[n][w]=Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1,dp), knapsack(wt, val, w, n - 1,dp));
        }

        return dp[n][w]=knapsack(wt, val, w, n - 1,dp);
    }
}
