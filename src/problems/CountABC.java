package problems;

public class CountABC {

    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }

        if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && (str.charAt(2) == 'a' || str.charAt(2) == 'c')) {
            return 1 + countAbc(str.substring(1));
        }

        return countAbc(str.substring(1));
    }

    public static void main(String[] args) {
        int result = countAbc("abc is not def");
        System.out.println(result);
    }
}
