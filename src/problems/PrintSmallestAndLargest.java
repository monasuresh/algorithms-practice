package problems;

import java.util.Arrays;

public class PrintSmallestAndLargest {

    public static void printSmallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Smallest: " + arr[0]);
        System.out.println("Largest: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] input = {0, 3, 4, 9};

        printSmallestAndLargest(input);
    }
}
