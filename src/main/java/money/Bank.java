package money;

public class Bank {
    Money reduce(Expression source, String to) {
        // TODO fixme キャストなくす > ポリモフィズムへ置き換え
        if (source instanceof Money) return ((Money) source).reduce(to);
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
