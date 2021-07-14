package problems;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /*
    partition() - This is the method that partitions into a left and right sub array based on a pivot value
     */
    public static int partition(int[] arr, int first, int last) {
        // Calculate the pivot
        int pivot = arr[(first + last) / 2];
        int i = first - 1;
        int j = last + 1;

        /*
        In an indefinite keep incrementing i if it is less than the pivot and decrementing j if it is greater than
        the pivot
         */

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            /*
            If i is less than j, then we swap i and j. Otherwise we return j
             */

            if (i < j) {
                swap(arr, i, j);
            } else {
                return j;
            }
        }
    }

    public static void qSort(int[] arr, int first, int last) {
        int split = partition(arr, first, last);

        if (first < split) {
            qSort(arr, first, split);
        }

        if (last > split + 1) {
            qSort(arr, split + 1, last);
        }
        List<Integer> result = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] input = {10, 2, 9, 5, 6};
        qSort(input, 0, input.length - 1);

    }
}
