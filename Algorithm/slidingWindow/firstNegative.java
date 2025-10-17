package Algorithm.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstNegative {
    //the question is to find the first negative number in a sub-array of size k;
    //and if there is no negative in k size subarray add 0;
    //return the list;
    public static void main(String[] args) {
        int[] arr={-1,2,3,7,-50,-10,15,2};
        int k=2;
        List ans=negativeIntegers(arr, k);
        System.out.println(ans.toString());
    }
    static List<Integer> negativeIntegers(int[] arr,int k){
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++){
            boolean found=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    list.add(arr[j]);
                    found=true;
                    break;
                }
            }
            if(!found){
                list.add(0);
            }
        }
        return list;
    }
}
