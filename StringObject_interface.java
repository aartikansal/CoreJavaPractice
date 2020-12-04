

/*
SimpleObject interface
*/

public class StringObject_interface {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
