package problems;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int numConsecutives = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                numConsecutives++;
            } else if (nums[i] == 0) {
                if (numConsecutives > maxConsecutives) {
                    maxConsecutives = numConsecutives;
                }
                numConsecutives = 0;
            }
        }

        if (numConsecutives > maxConsecutives) {
            maxConsecutives = numConsecutives;
        }
        return maxConsecutives;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 10, 4};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(input);

        System.out.println(maxConsecutiveOnes);
    }
}
