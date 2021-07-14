package problems;

public class Triangle {

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }

        return rows + triangle(rows - 1);
    }

    public static void main(String[] args) {
        int result = triangle(2);

        System.out.println(result);
    }
}
