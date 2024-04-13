// Design a Java program to model a bank account management system. Create classes for the bank account, including attributes such as
// account number, account holder name, account type (e.g., savings or checking), and account balance. Implement methods to perform 
// actions such as depositing funds, withdrawing funds, and checking the account balance. Ensure proper encapsulation of data and include
//  error handling mechanisms to handle scenarios like insufficient funds during withdrawals. Additionally, consider implementing features
//   such as transferring funds between accounts and generating account statements. This exercise will help you practice key OOP 
//   principles such as encapsulation, inheritance, and abstraction, as well as error handling techniques in Java programming.

package OOPs;

public class Practice_1 {
    public static class BankAccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println(amount + " deposited successfully. Current balance: " + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully. Current balance: " + balance);
            } else {
                System.out.println("Insufficient funds. Unable to withdraw.");
            }
        }

        public void checkBalance() {
            System.out.println("Current balance: " + balance);
        }

        public static void main(String[] args) {
            BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
            account.deposit(500.0);
            account.withdraw(200.0);
            account.checkBalance();
        }
    }
}
