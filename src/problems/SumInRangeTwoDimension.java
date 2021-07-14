package problems;

public class SumInRangeTwoDimension {

    public static int getSumInRange(int[][] prefixSum, int row1, int col1, int row2, int col2) {
        if (prefixSum == null || row1 < 0 || col1 < 0 || row2 < 0 || col2 < 0) {
            return 0;
        }

        try {
            return prefixSum[row2][col2] - prefixSum[row2][col1 - 1] - prefixSum[row1 - 1][col2] + prefixSum[row1 - 1][col1 - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 5}};

        int result = getSumInRange(input, 0, 0, 1, 1);

        System.out.println(result);
    }
}
