package problems;

public class Count7 {

    public static int count7(int n) {
        if (n == 7) {
            return 1;
        } else if (n < 7) {
            return 0;
        }

        int numSevens = count7(n / 10);
        if (n % 10 == 7) {
            return numSevens + 1;
        } else {
            return numSevens;
        }
    }

    public static void main(String[] args) {
        int result = count7(22);

        System.out.println(result);
    }
}
