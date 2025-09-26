public class Main {
    public static void main(String[] args) {

                Bank ceskaSporitelna = new Bank("848913", "Ceska Sporitelna");

                Human amir = new Human("Amir", "Azabi", 17);
                BankAccount amirAccount = new BankAccount(37918, 1200, amir, ceskaSporitelna);
                BankAccount amirAccount2 = new BankAccount(49231, 300, amir, ceskaSporitelna);

                Human oliver = new Human("Oliver", "Smitek", 16);
                BankAccount oliverAccount = new BankAccount(35021, -5, oliver, ceskaSporitelna);

                ceskaSporitelna.addAccount(amirAccount);
                ceskaSporitelna.addAccount(amirAccount2);
                ceskaSporitelna.addAccount(oliverAccount);

                amirAccount.isInDebt();
                oliverAccount.isInDebt();

                System.out.println("Celkem penez v bance: " + ceskaSporitelna.getTotalBalance());
                System.out.println("Pocet klientu: " + ceskaSporitelna.getClientCount());
            }
        }
