package Advanced_OOP;

public class SavingsAccount extends BankAccount {

    private double interest_rate;

    public SavingsAccount(String account_type, String customer_name, int balance, double interest_rate) {
        super(account_type, customer_name, balance);
        this.interest_rate = interest_rate;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    void calculate_interest() {

        double interest_amount = getBalance() * (interest_rate / 100) * 1;
        System.out.println("Your end interest amount after a year is: " + interest_amount);
    }

    @Override
    void deposit(int amount) {
        int newBalance = getBalance() + amount;
        //update a balance
        setBalance(newBalance);
        System.out.println("New balance after a deposit is: " + newBalance);
    }

    @Override
    void withdrawal(int amount) {

        if(amount<=getBalance()){
            int newBalance = getBalance() - amount;
            setBalance(newBalance);
            System.out.println("New balance after a deposit is: " + getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
