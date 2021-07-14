package problems;

public class CalculatePrefixSums {

    public static int[][] calculatePrefixSum(int[][] matrix) {
        int[][] prefixSum = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                prefixSum[i][j] = matrix[i][j];

                // Filling the prefix sum for the top row boundary (assumes that i is 0)
                if (j > 0) {
                    prefixSum[i][j] += prefixSum[i][j - 1];
                }

                // Filling the prefix sum for the left column boundary (assumes that j is 0)
                if (i > 0) {
                    prefixSum[i][j] += prefixSum[i - 1][j];
                }

                // Filling in the prefix sum for the inner elements
                if (j > 0 && i > 0) {
                    prefixSum[i][j] -= prefixSum[i - 1][j - 1];
                }
            }
        }

        return prefixSum;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 5}};

        int[][] result = calculatePrefixSum(input);

        System.out.println(result);
    }
}
