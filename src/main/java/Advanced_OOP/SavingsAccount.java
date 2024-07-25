package Advanced_OOP;

public class SavingsAccount extends BankAccount {

    private double interest_rate;

    public SavingsAccount(String password, int balance, double interest_rate) {
        super(password, balance); //calling parent constructor first
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

}
