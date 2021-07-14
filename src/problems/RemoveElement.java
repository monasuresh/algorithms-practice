package problems;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int slowCounter = 0;

        for (int fastCounter = 0; fastCounter < nums.length; fastCounter++) {
            if (nums[fastCounter] != val) {
                nums[slowCounter] = nums[fastCounter];
                slowCounter++;
            }
        }
        return slowCounter;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4};
        int result = removeElement(input, 1);

        System.out.println(result);
    }
}
