package problems;

public class SumInRange {

    public static long sumInRange(int from, int to) {
        int sum = 0;

        for (int i = from; i < to; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        long sumInRange = sumInRange(1, 4);

        System.out.println(sumInRange);
    }
}
