package problems;

public class ReverseInteger {

    public static int reverseInteger(int n) {
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
        }

        int reversed = 0;
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        if (isNegative) {
            return -reversed;
        } else {
            return reversed;
        }
    }

    public static void main(String[] args) {
        int result = reverseInteger(5);

        System.out.println(result);
    }
}
