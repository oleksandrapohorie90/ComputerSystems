package Advanced_OOP;

public class CheckingAccount extends BankAccount {

    int insufficient_funds_fee;

    public CheckingAccount(String account_type, String customer_name, int balance, int insufficient_funds_fee) {
        super(account_type, customer_name, balance);
        this.insufficient_funds_fee = insufficient_funds_fee;
    }

    private void process_deposit(int amount) {
        double newBalance = balance + amount;
        System.out.println("New balance after a deposit is processed is: " + newBalance);
    }

    @Override
    void deposit(int amount) {
        double newBalance = balance + amount;
        System.out.println("New balance after a deposit is: " + newBalance);
    }

    @Override
    void withdrawal(int amount) {
        double newBalance;

        if (amount >= balance) {
            newBalance = (balance - amount) - insufficient_funds_fee;
        } else {

            newBalance = getBalance() - amount;
            balance = (int) newBalance;
        }
        System.out.println("New Balance after withdrawal is: " + balance);
    }
}
