package Advanced_OOP;

public class SavingsAccount extends BankAccount {

     private double interest_rate;

    public SavingsAccount(String account_type, String customer_name, int balance, int interest_rate) {
        super(account_type, customer_name, balance);
        this.interest_rate = interest_rate;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    void calculate_interest(int amount) {

    }

    @Override
    void deposit(int amount) {

    }

    @Override
    void withdrawal(int amount) {

    }
}
