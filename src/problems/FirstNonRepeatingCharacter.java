package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char getFirstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (pair.getValue() == 1) {
                return pair.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        char result = getFirstNonRepeatingChar("smiles");

        System.out.println(result);
    }
}
