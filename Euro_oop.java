public class Euro_oop {
 public static void main(String[] args) {
        System.out.println(new Euro().getAmount());
    }

public static abstract class Money {
    abstract Money getMoney();
    public Object getAmount() {
        return getMoney().getAmount();
    }
}

public static class Euro extends Money {
    private double amount = 123d;

    public Euro getMoney() {
        return this;
    }

    public Object getAmount() {
        return amount;
    }

}
}
