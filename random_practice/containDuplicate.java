import java.util.Arrays;
import java.util.HashSet;

public class containDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,11,9,0,-1,5,11};
        System.out.println(useSorting(arr));
    }
    //find the duplicate element in a given array using different methods 

    static int useNestedloop(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }

            }
        }
        return 0;
    }

    static int useSorting(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }

    static int useHash(int[] arr){
        HashSet<Integer> hashSet= new HashSet<>();
        for(int i=0;i<arr.length-1;i++){
            if(hashSet.contains(arr[i])){
                return arr[i];
            }else{
                hashSet.add(arr[i]);
            }
        }
        return 0;
    }
}
