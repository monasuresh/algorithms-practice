package problems;

public class ReverseString {

    public static void reverseString(char[] s) {
        if (s == null || s.length == 0 || s.length == 1) {
            return;
        }

        int l = 0; int r = s.length - 1;

        while (l < r) {
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        char[] input = {'s', 'm', 'e'};
        reverseString(input);
    }
}
