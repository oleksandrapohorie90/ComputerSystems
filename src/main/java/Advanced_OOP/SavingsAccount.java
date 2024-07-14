package Advanced_OOP;

public class SavingsAccount extends BankAccount {

    private final double savings_interest_rate = 4.5;

    public SavingsAccount(String account_type, String customer_name, int balance) {
        super(account_type, customer_name, balance);
    }

    private void interest_rate(int amountOfInterest){

    }

    void calculate_interest(int amount){

    }

    @Override
    void deposit(int amount) {

    }

    @Override
    void withdrawal(int amount) {

    }
}
