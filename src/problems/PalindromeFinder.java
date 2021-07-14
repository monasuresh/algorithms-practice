package problems;

public class PalindromeFinder {

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("sos");

        System.out.println(result);
    }
}
