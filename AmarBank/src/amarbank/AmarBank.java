package amarbank;

import amarbank.account.CurrentAccount;
import amarbank.account.SavingAccount;

public class AmarBank {

    public static void main(String[] args) {

        SavingAccount saving = new SavingAccount();
        saving.deposit(500);
        saving.withdraw(300);
        saving.setAccountNumber("AC1254");
        saving.printAccountDetails();

        System.out.println();

        CurrentAccount current = new CurrentAccount();
        current.setAccountNumber("Acc1254");
        current.deposit(100);
        current.withdraw(50);  
        current.printAccountDetails();
    }

}
