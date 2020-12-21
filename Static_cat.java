
/*
Static modifiers and kittens

*/

public class Static_cat {
    public static void main(String[] args) {

    }

    public static Cat cat;

    public static class Cat {
        public String name;
    }

    static {
        Cat cat = new Cat();
        cat.name = "Simba";

        Static_cat.cat = cat;
        System.out.println(cat.name);
    }
}
