package problems;

public class Array220 {

    public static boolean array220(int[] nums, int index) {
        if (nums.length < 2) {
            return false;
        }

        if (index >= nums.length - 1) {
            return false;
        }

        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }

        return array220(nums, index + 1);
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 0, 4};
        boolean result = array220(input, 2);
        System.out.println(result);
    }
}
