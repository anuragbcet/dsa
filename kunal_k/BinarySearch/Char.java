package kunal_k.BinarySearch;

public class Char {
    public static void main(String[] args) {
        // Here the question is to find the smallest charter larger than the target
        // element.
        char[] arr = { 'c', 'e', 'f', 'o' };
        char target = 'z';
        System.out.println(Leastgreatest(arr, target));
    }

    static char Leastgreatest(char[] arr, char target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            if (s == arr.length - 1) {
                return arr[0];
            }
            int mid = s + (e - s) / 2;
            if (target < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return arr[s];
    }

}