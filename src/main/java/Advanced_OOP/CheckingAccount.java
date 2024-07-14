package Advanced_OOP;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String account_type, String customer_name, int balance) {
        super(account_type, customer_name, balance);
    }

    private void insufficient_funds_fee(int amount) {

    }

    private void process_deposit(int amount) {

    }

    @Override
    void deposit(int amount) {

    }

    @Override
    void withdrawal(int amount) {

    }
}
