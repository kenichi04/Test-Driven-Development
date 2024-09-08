package money;

public class Bank {
    Money reduce(Expression source, String to) {
        // TODO fixme キャストなくす
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
