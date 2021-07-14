package problems;

public class PairStar {

    public static String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }

        return str.charAt(0) + pairStar(str.substring(1));
    }

    public static void main(String[] args) {
        String result = pairStar("4 ** 5");
        System.out.println(result);
    }
}
