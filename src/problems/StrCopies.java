package problems;

public class StrCopies {

    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }

        if (str.length() < sub.length() || sub == "" || str == "") {
            return false;
        }

        if (str.startsWith(sub) && n == 1) {
            return true;
        } else if (str.startsWith(sub) && n != 0){
            return strCopies(str.substring(1), sub, n - 1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }
    }

    public static void main(String[] args) {
        boolean result = strCopies("i am a copy cat of another cat", "cat", 2);
        System.out.println(result);
    }
}
