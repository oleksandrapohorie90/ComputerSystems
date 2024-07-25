package Advanced_OOP;

public interface Account {

   //abstract by default
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    void changePassword(String oldPass, String newPass);

}
