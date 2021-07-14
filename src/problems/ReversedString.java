package problems;

public class ReversedString {
    public static String reversedString(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        String reversed = null;

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String result = reversedString("zebra");
        System.out.println(result);
    }
}
