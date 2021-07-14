package problems;

public class ChangePi {

    public static String changePi(String str) {
        /*
        The following base cases: The string is less than 2 characters means that there can never be a pi
         */
        if (str.length() < 2) {
            return str;
        }

        /*
        If the first character is p and the second character is i then return a new string with 3.14 concatenated with
        the result of recursively processing the substring after pi
         */
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return 3.14 + changePi(str.substring(2));
        }

        // Otherwise return the first character plus the result of processing the substring starting from the second char

        return str.charAt(0) + changePi(str.substring(1));
    }


    public static void main(String[] args) {
        String result = changePi("pi plus pi");

        System.out.println(result);
    }
}
