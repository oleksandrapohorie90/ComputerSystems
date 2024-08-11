package Advanced_OOP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {

    private double interest_rate;

    public SavingsAccount(String password, int balance, double interest_rate) {
        super(password, balance); //calling parent constructor first
        this.interest_rate = interest_rate;
    }

    public double calculate_interest(int years) {
        double interest_amount = (getBalance() * (interest_rate / 100) * years);
        BigDecimal roundedAmount = new BigDecimal(interest_amount).setScale(2, RoundingMode.HALF_UP);
        double roundedInterestAmount = roundedAmount.doubleValue();
        System.out.println("Your end interest amount after "+years+" year/s is: " + roundedInterestAmount);
        return roundedInterestAmount;
    }

}
