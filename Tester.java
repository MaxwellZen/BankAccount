
public class Tester {
  public static void main(String[] args) {
    BankAccount test = new BankAccount(123, "password");
    System.out.println(test.getAccountID());
    System.out.println(test.getBalance());
  }
}
