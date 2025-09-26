import java.util.ArrayList;

public class Bank {

    private String code;
    private String name;

    public ArrayList<BankAccount> accounts;

    public Bank(String code, String name) {
        this.code = code;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public int getTotalBalance() {
        int celkemPenize = 0;

        for (BankAccount ucet : accounts) {
            celkemPenize += ucet.getBalance();
        }
        return celkemPenize;
    }

    public int getClientCount() {
        return accounts.size();     //pocita ucty, ne klienty
    }

}
