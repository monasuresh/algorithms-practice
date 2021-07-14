package problems;

public class FindNumbers {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 10, 4};
        int numbers = findNumbers(input);

        System.out.println(numbers);
    }
}
