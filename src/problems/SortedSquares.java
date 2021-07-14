package problems;

import java.util.ArrayList;
import java.util.List;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int[] sortedSquaresArray = new int[nums.length];

        int posIndex = 0;
        while (posIndex < nums.length && nums[posIndex] < 0) {
            posIndex++;
        }

        int negativeIndex = posIndex - 1;
        int count = 0;

        while (0 <= negativeIndex && posIndex < nums.length) {
            if (nums[posIndex] * nums[posIndex] < nums[negativeIndex] * nums[negativeIndex]) {
                sortedSquaresArray[count] = nums[posIndex] * nums[posIndex];
                posIndex++;
            } else {
                sortedSquaresArray[count] = nums[negativeIndex] * nums[negativeIndex];
                negativeIndex--;
            }
            count++;
        }

        while (posIndex < nums.length) {
            sortedSquaresArray[count] = nums[posIndex] * nums[posIndex];
            posIndex++;
            count++;
        }

        while (negativeIndex >= 0) {
            sortedSquaresArray[count] = nums[negativeIndex] * nums[negativeIndex];
            negativeIndex--;
            count++;
        }

        return sortedSquaresArray;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 10, 4};
        int[] sortedSquares = sortedSquares(input);

        List<Integer> result = new ArrayList<>(sortedSquares.length);
        for (int i = 0; i < sortedSquares.length; i++) {
            result.add(sortedSquares[i]);
        }

        System.out.println(result);
    }
}
