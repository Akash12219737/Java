package OOPs;
public class Account {
    private double balance;
    private String name;
    private static double fee = 1.0; // Transaction fee
  
    public Account(String name, double balance) {
      this.name = name;
      this.balance = balance;
    }
  
    public void deposit(double amount) {
      balance += amount - fee;
      System.out.println("Deposited: $" + amount + " (after fee: $" + fee + ")");
    }
  
    public double getBalance() {
      return balance;
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Account account = new Account("John Doe", 100.0);
  
      account.deposit(50.0);
      System.out.println("Current balance: $" + account.getBalance());
  
      account.deposit(20.0);
      System.out.println("Current balance: $" + account.getBalance());
    }
  }
  