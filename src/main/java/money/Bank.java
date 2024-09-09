package money;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String from, String to, int rate) {}

    int rate(String from, String to) {
        // TODO 仮実装
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}
