package problems;

import java.util.ArrayList;
import java.util.List;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 0};
        int[] r = runningSum(input);

        List<Integer> result = new ArrayList<>(r.length);

        for (int i = 0; i < r.length; i++) {
            result.add(r[i]);
        }
        System.out.println(result);
    }
}
