import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) throws Exception {
        BankAccount[] accounts = new BankAccount[10];
        for(int i = 0;i<5;i++){
            accounts[i] = new CheckingAccount(1000);
        }
        for(int i = 5;i<10;i++){
            accounts[i] = new SavingAccount(1000,10);
        }
        System.out.println(accounts[4].getBalance());
        System.out.println("D)Deposit W)Withdraw M)MonthEnd Q)Quite ");
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            String input = in.next();
            if (input.equals("D") || input.equals("W") || input.equals("M")) {
                System.out.println("Enter Account Number and Amount : ");

                if (input.equals("D")) {
                    int num = in.nextInt();
                    double amount = in.nextDouble();
                    accounts[num].deposit(amount);
                    System.out.println("Balance: " + accounts[num].getBalance());
                } else if (input.equals("W")) {
                    int num = in.nextInt();
                    double amount = in.nextDouble();
                    accounts[num].withdraw(amount);
                    System.out.println("Balance: " + accounts[num].getBalance());
                } else {
                    for (int i = 0; i < accounts.length; i++) {
                        accounts[i].monthEnd();
                    }
                }
            } else if (input.equals("Q")) {
                done = true;
            } else {
                throw new Exception("Invalid Input!");
//                System.out.println("Invalid!");
            }
        }
        accounts[3].monthEnd();
    }
}
