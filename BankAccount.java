public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount (int a, String p) {
    this.balance = 0;
    this.accountID = a;
    this.password = p;
  }
  public double getBalance() {
    return this.balance;
  }
  public int getAccountID() {
    return this.accountID;
  }
  public void setPassword(String newPass) {
    this.password = newPass;
  }
  public boolean deposit(double amount) {
    if (amount < 0) {
      return false;
    } else {
      this.balance += amount;
      return true;
    }
  }
  public boolean withdraw(double amount) {
    if (amount > balance || amount < 0) {
      return false;
    } else {
      balance -= amount;
      return true;
    }
  }
}
