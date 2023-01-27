public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;

    }


    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance < amount) {
//            throw new Exception("Amount Exceeds the main Balance! Please Inset a valid amount");
            System.out.println("Amount Exceeds the balance");
        } else
            balance = balance - amount;
    }

    public void monthEnd() {
        System.out.println("Balance = " + getBalance());
    }

    public double getBalance() {
        return balance;
    }
}
