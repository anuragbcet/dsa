package kunal_k.Arrays.twodarray;

import java.util.Arrays;

public class sortTwoD {
    public static void main(String[] args) {
        int[][] arr={{1,2},{4,5},{3,9},{2,11}};
        Arrays.sort(arr,(r1,r2)->Integer.compare(r1[0], r2[0]));
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
    
}
