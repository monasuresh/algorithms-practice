package problems;

public class NumOccurrences {

    public static int getNumOccurrences(String str, char c) {
        if (str.equals("")) {
            return 0;
        }

        int rest = getNumOccurrences(str.substring(1), c);

        if (str.charAt(0) == c) {
            return rest + 1;
        } else {
            return rest;
        }
    }

    public static void main(String[] args) {
        int numOccurrences = getNumOccurrences("monica", 'n');

        System.out.println(numOccurrences);
    }
}
