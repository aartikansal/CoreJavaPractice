
import java.util.HashMap;
import java.util.Map;

/*
Static modifiers: part 1
*/

public class Static_modifier {
    public static Map<Double, String> labels = new HashMap<>();
    static{
        labels.put(5.1,"five");
        labels.put(6.1,"six");
        labels.put(7.1,"seven");
        labels.put(8.1,"eight");
        labels.put(9.1,"nine");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
