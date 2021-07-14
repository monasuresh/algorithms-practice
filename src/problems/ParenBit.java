package problems;

public class ParenBit {

    public static String parenBit(String str) {
//        if (str.startsWith("(")) {
//            return str.substring(0, 1);
//        }
//
        if (str.equals("")) {
            return "";
        }

        String rest = parenBit(str.substring(1));

        if (str.startsWith("(")) {
            return str.charAt(0) + rest;
        } else if (str.startsWith(")")) {
            return rest + str.charAt(0);
        } else if (!rest.startsWith("(") && rest.endsWith(")")){
            return str.charAt(0) + rest;
        } else {
            return rest;
        }
    }


    public static void main(String[] args) {
        String result = parenBit("(x+y) * z");
        System.out.println(result);
    }
}
