package problems;

import java.util.Arrays;

public class PairSums {

    public static void printAllPairSums(int[] arr, int n) {
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length  - 1;

        // have two pointers
        while (l < r) {
            // If we find a sum then print the pair sum
            if (arr[l] + arr[r] == n) {
                System.out.println(arr[l] + " + " + arr[r] + " = " + n);
                l++;
                r--;
            } else if (arr[l] + arr[r] < n) {
                // if the two elements added up is less than n then we increment l
                l++;
            } else {
                // if the two elements added up is greater than n then we decrement r
                r--;
            }
        }
    }


    public static void main(String[] args) {
        int[] input = {0, 2, 2, 4};
        printAllPairSums(input, 4);
    }
}
