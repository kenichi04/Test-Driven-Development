package money;

public class Sum implements Expression {
    /** 被加算数 */
    Money augend;
    /** 加数 */
    Money added;

    Sum(Money augend, Money added) {
        this.augend = augend;
        this.added = added;
    }

    public Money reduce(String to) {
        int amount = augend.amount + added.amount;
        return new Money(amount, to);
    }
}
