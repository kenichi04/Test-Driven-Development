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

    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), added.times(multiplier));
    }

    public Expression plus(Expression added) {
        return new Sum(this, added);
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount
                + added.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
