package kunal_k.Recurssion;
public class Linear_search {
	// Add your methods and fields here
    public static void main(String[] args) {
        // System.out.println("hello");
        int[] arr={2,5,8,9,11,56,17};
        int target=19;
        System.out.println(find(arr, target, 0));
    }

    static boolean find (int[] arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
}