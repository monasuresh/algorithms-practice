package problems;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        int result = factorial(3);

        System.out.println(result);
    }
}
