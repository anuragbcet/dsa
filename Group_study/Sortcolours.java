import java.util.Arrays;

public class Sortcolours {
    public static void main(String[] args) {
        int[] arr = { 1,2,0};
        System.out.println(Arrays.toString(sortcolors(arr)));
    }

    static int[] sortcolors(int[] nums) {
        int last = nums.length - 1;
        int first = 0;
        for (int i = 0; i <= last; i++) {
            if (nums[i] == 0) {
                int temp = nums[first];
                nums[first] = nums[i];
                nums[i] = temp;
                first++;
            }
            if (nums[i] == 2) {
                int temp = nums[last];
                nums[last] = nums[i];
                nums[i] = temp;
                last--;

            }
            System.out.println(i);
        }
        return nums;

    }
}
