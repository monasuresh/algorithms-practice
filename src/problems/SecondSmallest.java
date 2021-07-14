package problems;

public class SecondSmallest {

    public static int secondSmallest(int[] arr) {
        int smallest = Math.min(arr[0], arr[1]);
        int secondSmallest = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {

        int[] input = {2, 9, 0, 5};
        int result = secondSmallest(input);

        System.out.println(result);
    }
}
