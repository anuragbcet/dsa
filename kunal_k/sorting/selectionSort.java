package kunal_k.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={9,-5};
        System.out.println(max(arr,0,3));
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
           int maxIndex=max(arr, 0, arr.length-i-1);
           swap(arr, maxIndex,arr.length-i-1); 
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int max(int[] arr,int start,int end){
        int max=start;
        for(int i=1;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    
}
