

import java.awt.*;

/*
A fox is an animal

*/

public class Fox_abstract {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

    }
}