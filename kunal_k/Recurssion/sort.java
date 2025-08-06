package kunal_k.Recurssion;

public class sort {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr={10,15,20,25,35};
        System.out.println(sortArr(arr,0));
        // sort(arr, 0);
    }
    static boolean sortArr(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index+1]>arr[index] && sortArr(arr, index+1);
    }
    
}
