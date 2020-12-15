
/*
OOP: Arrange interfaces

*/

public class Arrange_interfaces {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Discountable, Sellable {
        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public Object getAllowedAction(String name) {
            return null;
        }
    }
}
