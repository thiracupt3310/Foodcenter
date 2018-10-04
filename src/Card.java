public class Card {
    private double balance;

    public void topUp(double money) {
        if (money < 0)
                throw new IllegalArgumentException("money must be positive");
        this.balance += money;
    }
    public void spend(double purchase) {
        if (purchase < 0)
            throw new IllegalArgumentException("money must be positive");
        this.balance -= purchase;
    }

    public double getBalance() {
        return balance;
    }
}
