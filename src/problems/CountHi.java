package problems;

public class CountHi {

    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        }

        if (str.startsWith("hi")) {
            return countHi2(str.substring(2)) + 1;
        }

        return countHi2(str.substring(1));
    }

    public static void main(String[] args) {
        int result = countHi2("hi there everybody");

        System.out.println(result);
    }
}
