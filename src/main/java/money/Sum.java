package money;

public class Sum implements Expression {
    /** 被加算数 */
    Expression augend;
    /** 加数 */
    Expression added;

    Sum(Expression augend, Expression added) {
        this.augend = augend;
        this.added = added;
    }

    public Expression plus(Expression added) {
        // TODO 空実装
        return null;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount
                + added.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
