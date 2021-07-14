package problems;

public class FindThirdMax {

    public static int findThirdMaximum(int[] nums) {
        Integer fm = null, sm = null, tm = null;
        // This line goes through each item in the int array and checks to see if the firstMax is null or if the number is greater than the firstMax
        // If it is, the number is assigned to the firstMax
        for (int num : nums) {
            if (fm == null || num > fm) {
                tm = sm;
                sm = fm;
                fm = num;
            } else if (num == fm) {
                continue;
            } else if (sm == null || num > sm) {
                tm = sm;
                sm = num;
            } else if (num == sm) {
                continue;
            } else if (tm == null || num > tm) {
                tm = num;
            }
        }
        if (tm != null) {
            return tm;
        } else {
            return fm;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 10, 4};

        int result = findThirdMaximum(input);

        System.out.println(result);
    }
}
