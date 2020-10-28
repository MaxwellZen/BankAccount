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
  
}
