



/*
Making a human

*/

public class human_implement {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void swim() {

        }

        public void run() {

        }


    }


    public class Duck implements CanSwim, CanRun, CanFly {
        public void swim() {

        }

        public void run() {

        }

        public void fly() {

        }

    }


    public class Penguin implements CanSwim, CanRun {
        public void swim() {

        }

        public void run() {

        }


    }


    public class Airplane implements CanRun, CanFly {
        public void run() {

        }

        public void fly() {

        }

    }
}

