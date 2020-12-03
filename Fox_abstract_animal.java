
import java.awt.*;

/*
One method in a class

*/

public class Fox_abstract_animal {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
