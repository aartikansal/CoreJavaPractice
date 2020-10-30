

/*
Human class and CanRun and CanSwim interfaces
*/

public class Human_implements_abstract {
    public static void main(String[] args) {
    }

    public interface CanRun{
        public void run();
    }
    public interface CanSwim{
        public void swim();
    }
    abstract class Human implements CanRun, CanSwim{
    }
}
