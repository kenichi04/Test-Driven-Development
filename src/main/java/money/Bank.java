package money;

public class Bank {
    Money reduce(Expression source, String to) {
        // TODO fixme キャストなくす
        if (source instanceof Money) return (Money) source;
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
