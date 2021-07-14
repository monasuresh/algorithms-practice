package problems;

public class NoX {

    public static String noX(String str) {
        if (str.equals("")) {
            return str;
        }

        String rest = noX(str.substring(1));

        if (str.startsWith("x")) {
            return rest;
        } else {
            return str.charAt(0) + rest;
        }
    }

    public static void main(String[] args) {
        String result = noX("xo xo");
        System.out.println(result);
    }
}
