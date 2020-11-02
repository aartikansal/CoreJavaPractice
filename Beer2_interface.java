

/*
Beer. Part 2. The recovery.

*/

public class Beer2_interface {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Alcoholic beverage";
            } else {
                return "Non-alcoholic beverage";
            }

        }
        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
    }
