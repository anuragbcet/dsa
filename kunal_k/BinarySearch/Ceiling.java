package kunal_k.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,18,19};
        int ceiling = Findceiling(arr, 20);
        System.out.println(ceiling);
        
    }

    static int Findceiling(int[] arr,int target){
        int ceiling=-1;
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
                ceiling=mid;
            }
            else if(target==arr[mid]){
                return mid;
            }
            
        }

        return ceiling;
    }
}
