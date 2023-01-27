public class BasicBankDemo {
    public static void main(String[] args) throws Exception {
        BankAccount b = new BasicAccount(1000);
        b.withdraw(120);
        System.out.println(b.getBalance());
        BankAccount c = new CheckingAccount(1000);
        c.withdraw(1200);
        System.out.println(c.getBalance());
        c.withdraw(1200);
        System.out.println(c.getBalance());
        c.withdraw(1200);
        System.out.println(c.getBalance());
        c.withdraw(1200);
        System.out.println(c.getBalance());
        c.monthEnd();
        c.withdraw(1200);
        System.out.println(c.getBalance());
    }
}
