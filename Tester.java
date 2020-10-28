
public class Tester {
  public static void main(String[] args) {
    BankAccount test = new BankAccount(123, "password");
    System.out.println(test.getAccountID());
    System.out.println(test.getBalance());
    test.setPassword("newpassword");
    System.out.println(test.deposit(5));
    System.out.println(test.getBalance());
    System.out.println(test.withdraw(5));
    System.out.println(test.getBalance());

  }
}
