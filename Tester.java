
public class Tester {
  public static void main(String[] args) {
    BankAccount test = new BankAccount(123, "password");
    BankAccount test2 = new BankAccount(1234, "eh");
    System.out.println(test.getAccountID());
    System.out.println(test.getBalance());
    test.setPassword("newpassword");
    test.deposit(100);
    System.out.println(test.transferTo(test2, 100, "newpassword"));
    System.out.println(test);
    System.out.println(test2);
    System.out.println(test.deposit(5));
    System.out.println(test.getBalance());
    System.out.println(test.withdraw(5));
    System.out.println(test.getBalance());
    System.out.println(test.toString());
  }
}
