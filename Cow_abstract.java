
/*
Cows are animals too

*/

public class Cow_abstract {
        public static void main(String[] args) {
            Animal c = new Cow();
            System.out.println( c.getName() );
        }


            abstract static class Animal {
            public abstract String getName();
        }

        static class Cow extends Animal{

            private String name;
            public Cow() {
                this.name = "cow";
            }

            @Override
            public String getName(){
                return name;
            }


        }

    }
