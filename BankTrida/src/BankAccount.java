import java.nio.file.Paths;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private Bank bank;
    private Human owner;

    public BankAccount (int accountNumber, int balance, Human owner, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.bank = bank;
    }

    public int getBalance() {
        return balance;
    }

    public void isInDebt() {
        if (balance < 0) {
            System.out.println(owner + " is in debt");
        } else System.out.println(owner + " is not in debt");
    }



}
