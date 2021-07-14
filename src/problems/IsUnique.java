package problems;

public class IsUnique {

    public static boolean isUnique(String str) {
        /*
        There are only 128 characters. If the length of the string is greater than 128, it must mean that at least
        one character is repeating
         */
        if (str.length() > 128) {
            return false;
        }

        boolean[] isUniqueArray = new boolean[128];

        /*
        The program is looping through the String and checking the boolean array to see if the element at the index
        corresponding to the ascii character is set to true. If it is, the character is not unique and the program
        returns false. Otherwise, the element at the index is set to true
         */
        for (int i = 0; i < str.length(); i++) {
            if (isUniqueArray[str.charAt(i)]) {
                return false;
            }

            isUniqueArray[str.charAt(i)] = true;
        }

        return true;
    }


    public static void main(String[] args) {
        boolean result = isUnique("is this unique");
        System.out.println(result);
    }
}
