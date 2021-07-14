package problems;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int currentWordLength = 0;
        int lastWordLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                currentWordLength = 0;
            } else {
                currentWordLength++;
                lastWordLength = currentWordLength;
            }
        }
        return lastWordLength;
    }

    public static void main(String[] args) {
        int result = lengthOfLastWord("my name is monica");

        System.out.println(result);
    }
}
