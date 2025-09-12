package kunal_k.BinarySearch;

public class basic {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 9, 17, 88, 105 };
        System.out.println(BinarySearch(arr,9));
    }

    static int BinarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
