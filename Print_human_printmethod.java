

public class Print_human_printmethod {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Man man = new Man();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
