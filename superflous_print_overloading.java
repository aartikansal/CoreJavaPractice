
/*
OOP: Method overloading - Eliminating the superfluous
*/

public class superflous_print_overloading {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(byte b) {
        System.out.println("I will be a Java programmer!");
    }

    public static void print(double d) {
        System.out.println("I will be a Java programmer!");
    }

    public static void print(long l) {
        System.out.println("I will be a Java programmer!");
    }

    public static void print(float f) {
        System.out.println("I will be a Java programmer!");
    }

    public static void print(char c) {
        System.out.println("I will be a Java programmer!");
    }
}
