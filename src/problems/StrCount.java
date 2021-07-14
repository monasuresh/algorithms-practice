package problems;

public class StrCount {

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.startsWith(sub)) {
            return strCount(str.substring(sub.length()), sub) + 1;
        }

        return strCount(str.substring(1), sub);
    }

    public static void main(String[] args) {
        int result = strCount("my name is bond, james bond", "bond");

        System.out.println(result);
    }
}
