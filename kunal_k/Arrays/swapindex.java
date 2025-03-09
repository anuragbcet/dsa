package kunal_k.Arrays;

import java.util.Arrays;

public class swapindex{
	public static void main(String[] agrs){
		System.out.println("hello");
		int[] arr ={ 1,2,6,9,65,77};
		swap(arr,1,4);
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr,int index1,int index2){
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

}

