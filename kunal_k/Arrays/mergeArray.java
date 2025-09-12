package kunal_k.Arrays;

import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 2, 3, 4 };
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int left = 0;
        int right = 0;
        int idx = 0;
        int[] ans = new int[m + n];
        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                ans[idx] = arr1[left];
                left++;
                idx++;
            } else {
                ans[idx] = arr2[right];
                right++;
                idx++;
            }
        }
        while (left < n) {
            ans[idx++] = arr1[left++];
        }

        // Add remaining elements from arr2 (if any)
        while (right < m) {
            ans[idx++] = arr2[right++];
        }
        return ans;
    }
}
