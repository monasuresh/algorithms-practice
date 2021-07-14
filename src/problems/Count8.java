package problems;

public class Count8 {

    public static int count8(int n) {
        if (n < 8) {
            return 0;
        }

        int rest = count8(n / 10);

        if (n % 100 == 88) {
            return rest + 2;
        } else if (n % 10 == 8) {
            return rest + 1;
        } else {
            return rest;
        }
    }

    public static void main(String[] args) {
        int result = count8(13);
        System.out.println(result);
    }
}
