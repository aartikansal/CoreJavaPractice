

/*
Making the top ten

*/

public class Overload_10 {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }
    public static int transformValue(Integer i) {
        return i * 2;
    }


    public static int transformValue(int i) {
        return i * i;
    }

}