


/*
CanFly, CanRun, and CanSwim for the Duck, Penguin, and Toad classes
*/

public class Toad_override_inherit {
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

    public class Duck implements CanRun,CanSwim,CanFly {
        @Override
        public void swim(){

        }
        @Override
        public void run(){

        }
        @Override
        public void fly(){

        }


    }

    public class Penguin implements CanSwim,CanRun {
        @Override
        public void swim(){

        }
        @Override
        public void run(){

        }

    }

    public class Toad implements CanSwim {
        @Override
        public void swim(){

        }
    }
}
