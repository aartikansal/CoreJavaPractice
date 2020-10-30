

/*
We all have a little cat in us…

*/

public class Cat_override {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "I'm Fluffy";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "I'm a Cat";
        }
    }
}
