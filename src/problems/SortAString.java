package problems;

import java.util.Arrays;

public class SortAString {

    public static String sort(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static boolean checkPermutations(String str1, String str2) {
        // If the lengths of the two strings are not equal then they are not permutations of each other
        if (str1.length() != str2.length()) {
            return false;
        }

        return sort(str1).equals(sort(str2));
    }

    public static void main(String[] args) {
        String input = "adbcfe";
        String result = sort(input);
        System.out.println(result);

        boolean isAPerm = checkPermutations(input, "ad");
        System.out.println("is it a permutation: " + isAPerm);
    }
}
