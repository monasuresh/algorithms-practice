package problems;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> numbers = new ArrayList<>();
        boolean goDown = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (goDown) {
                    j = matrix[0].length - 1;
                }

                numbers.add(matrix[i][j]);
                if (j == matrix[0].length - 1 && !goDown) {
                    goDown = true;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 5}};

        List<Integer> result = spiralOrder(input);

        System.out.println(result);
    }
}
