package problems;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {

    public static List<Integer> missingNumbers(int[] arr, int numberOfElements) {
        boolean isPresent = false;
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= numberOfElements; i++) {
            isPresent = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 5};
        List<Integer> result = missingNumbers(input, 4);

        System.out.println(result);
    }
}
