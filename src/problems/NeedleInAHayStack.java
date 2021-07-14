package problems;

public class NeedleInAHayStack {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int result = strStr("needle in a haystack", "e");

        System.out.println(result);
    }
}
