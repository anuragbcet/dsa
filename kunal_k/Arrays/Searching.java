package kunal_k.Arrays;
//applying the normal searching method to find the position of the target element in a 2D-array.

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int[][] arr={{1,5,6,2},{2,3,0},{56,98},{77,88,99,100}};
        int target =7;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][]arr,int target){
        for(int i=0;i<arr.length;i++){
            // System.out.println(Arrays.toString(arr[i]));
            for(int j=0;j<arr[i].length;j++){
                // System.out.println("row :"+arr[i].length);
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    
}
