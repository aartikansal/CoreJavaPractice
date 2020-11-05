


/*
Tom, Jerry and Spike

*/

public class Tom_interface {
    public static void main(String[] args) {

    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }
    public  static class Cat implements CanMove, Edible{
        @Override
        public void move(){

        }

        @Override
        public void beEaten() {

        }
    }
    public static class Dog implements CanMove, CanEat{
        @Override
        public void move(){

        }
        @Override
        public void eat(){

        }
    }

}
