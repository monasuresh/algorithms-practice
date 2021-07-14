package problems;

public class Array11 {

    public static int array11(int[] nums, int index) {
        if (nums.length == 0 || index >= nums.length) {
            return 0;
        }

        int numOfElevens = array11(nums, index + 1);

        if (nums[index] == 11) {
            return numOfElevens + 1;
        } else {
            return numOfElevens;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 5, 6, 7, 8, 9, 19, 10};
        int result = array11(input, 3);

        System.out.println(result);
    }
}
