



/*
All that moves

*/

public class Speed_method {
    public static void main(String[] args) {
    }
    public interface CanMove{
         Double speed();
        }
    public interface CanFly extends CanMove {
          Double speed(CanFly fly);

        }

    }
