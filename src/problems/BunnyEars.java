package problems;

public class BunnyEars {

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        int numberOfEars = bunnyEars2(bunnies - 1);
        if (bunnies % 2 == 0) {
            return numberOfEars + 3;
        } else {
            return numberOfEars + 2;
        }
    }

    public static void main(String[] args) {
        int result = bunnyEars2(2);

        System.out.println(result);
    }
}
