package problems;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        List<Integer> result = new ArrayList<>(arr.length);

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] input = {1, 4, 3, 7, 10, 0};
        bubbleSort(input);
    }
}
