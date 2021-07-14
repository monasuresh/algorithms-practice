package problems;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
        }
        return null;
    }

    public static void main(String[] args) {
        String[] input = {"do you see", "what i see"};
        String result = longestCommonPrefix(input);

        System.out.println(result);
    }
}
