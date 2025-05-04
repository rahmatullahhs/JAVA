
package amarbank.account;


public class Account {
     protected String accountNumber;
    protected double balance;

    public Account() {
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited" + amount+ "tk");
        } else {
            System.out.println("Invalid  amount");
        }
    }
    
    
    
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount+"TK");
        } else {
            System.out.println("Your Account is Empty");
        }
    }
    
    
   public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance+"tk");
    } 
    

}
