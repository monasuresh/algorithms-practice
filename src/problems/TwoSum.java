package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] input = {0, 2, 2, 4};

        int[] result = twoSum(input, 4);

        List<Integer> r = new ArrayList<>(result.length);

        for (int i = 0; i < result.length; i++) {
            r.add(result[i]);
        }

        System.out.println(r);
    }
}
