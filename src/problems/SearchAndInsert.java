package problems;

public class SearchAndInsert {

    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        } else if (target < nums[0]) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;
        int middle = high / 2;
        int prospect = middle;
        for (int i = 0; i < nums.length; i++) {
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                high = middle;
                middle = high / 2;
                prospect = middle;
            } else if (target > nums[middle]) {
                low = middle;
                middle = (high + low) / 2;
                prospect = middle;
            }
        }
        return prospect + 1;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 2, 4};
        int result = searchInsert(input, 2);

        System.out.println(result);
    }
}
