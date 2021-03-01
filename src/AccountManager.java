public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsuffiicentException {
        if (balance > amount)
            balance = getBalance() - amount;
        else
            throw new BalanceInsuffiicentException("bakiye yetersiz.");

    }

    public double getBalance() {
        return balance;
    }
}
