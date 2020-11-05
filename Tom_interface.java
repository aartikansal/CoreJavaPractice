

/*
Tom, Jerry and Spike
*/

public class Tom_interface {
    public static void main(String[] args) {

    }
    public interface CanMove {
        void move();
    }

    public interface Edible {
        void beEaten();
    }


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
    public static class Mouse implements CanMove, Edible{
    @Override
    public void move(){

    }
    @Override
    public void beEaten(){

    }
}
}
