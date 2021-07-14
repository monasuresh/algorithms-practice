package problems;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int potentialDuplicate = nums[0];
        int place = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != potentialDuplicate) {
                potentialDuplicate = nums[i];
                place++;
                nums[place] = potentialDuplicate;
            }
        }
        return place + 1;
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 3, 2, 5};
        int result = removeDuplicates(input);

        System.out.println(result);
    }
}
