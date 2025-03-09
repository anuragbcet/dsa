package kunal_k.Arrays;

public class Darray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{4,5}};
        // int[] arr2={1,5,6,8,9};
        int target=6;
        for(int[] a:arr){
            for(int b:a){
                if(b==target){
                   System.out.println(b);
                }
            }
            System.out.println();
        }
    }
  
}
