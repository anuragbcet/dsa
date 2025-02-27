package kunal_k.functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={5,89,6,7,78};
    changevalue(arr);
    System.out.println("changed array"+ Arrays.toString(arr));
    }
    static void changevalue(int[] arr){
        arr[0]=65;
       }
}


