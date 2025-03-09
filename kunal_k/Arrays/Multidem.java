package kunal_k.Arrays;

import java.util.Arrays;

public class Multidem {
    public static void main(String[] args) {
        /*
         * 1 2 3 
         * 4 5 6
         * 7 8 9
         */

         int[][] arr=new int[3][3];
         arr[0][0]=1;
         arr[0][1]=5;
         arr[0][2]=7;
        //  arr[0][3]=9;    this will give error at compilation time of index out of bound.
        //  arr[0][4]=65;
         System.out.println(arr[0][2]);
         System.out.println(Arrays.toString(arr[0]));
        //  System.out.println(arr[0]);

        //  System.out.println(arr);
        //  int[][] arr1={{1,2,3},{1,3,5}};
        //  System.out.println((arr1[1][2]));

        int [][] arr1 = {
            {1,3,6,9},
            {5,7},
            {10,15,18}
        };
        for (int[] a:arr1){
            System.out.println(Arrays.toString(a));
        }

    }
}
