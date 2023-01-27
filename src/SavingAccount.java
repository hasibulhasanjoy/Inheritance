public class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(double balance,double interestRate) {
        super(balance);
        this.interestRate = interestRate/100;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void monthEnd() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        super.monthEnd();
    }

}
