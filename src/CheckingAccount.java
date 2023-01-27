public class CheckingAccount extends BankAccount {
    private final int FREE_WITHDRAW = 3;
    private final int WITHDRAW_FEE = 1;
    private int withdraws;

    public CheckingAccount(double balance) {
        super(balance);
        withdraws = 0;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void withdraw(double amount) throws Exception {
        withdraws++;
        if (withdraws > FREE_WITHDRAW) {
            super.withdraw(WITHDRAW_FEE);
        }
        if (amount > super.getBalance()) {
            if (withdraws == 1) {
                super.withdraw(20);
            } else {
                super.withdraw(30);
            }
        }
        super.withdraw(amount);
    }

    @Override
    public void monthEnd() {
        withdraws = 0;
        super.monthEnd();
    }
}
