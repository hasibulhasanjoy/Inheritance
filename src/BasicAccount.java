public class BasicAccount extends BankAccount {
    public BasicAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) throws Exception {
//        super.withdraw(amount);
        if (super.getBalance() < amount) {
//            System.out.println("Amount Exceeds the Balance!");
            super.withdraw(30);
            System.out.println("30$ has been charged due to balance overdraft");
        } else
            super.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
