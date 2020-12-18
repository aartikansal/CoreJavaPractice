
/*
OOP: Method overloading
*/

public class Method_over {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Filling with Integer objects");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Filling with Double objects");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Filling with Float objects");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Long value) {
        System.out.println("Filling with Long objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
