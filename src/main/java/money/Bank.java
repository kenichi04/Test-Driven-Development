package money;

public class Bank {
    Money reduce(Expression source, String to) {
        // TODO fixme キャストなくす
        Sum sum = (Sum) source;
        // TODO fixme フィールドアクセス
        int amount = sum.augend.amount + sum.added.amount;
        return new Money(amount, to);
    }
}
