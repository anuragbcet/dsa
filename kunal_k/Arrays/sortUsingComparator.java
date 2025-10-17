package kunal_k.Arrays;

import java.util.Arrays;

public class sortUsingComparator {
    public static void main(String[] args){
        int [] arr={2,5,7,1,-55,-10};
        int [] arr2=Arrays.copyOf(arr,arr.length-2);
        arr2[2]=100;
        System.out.println("arr"+Arrays.toString(arr));
        System.out.println("arr2"+Arrays.toString(arr2));

    }
}
