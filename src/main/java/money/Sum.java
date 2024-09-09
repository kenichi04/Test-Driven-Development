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

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount
                + added.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
