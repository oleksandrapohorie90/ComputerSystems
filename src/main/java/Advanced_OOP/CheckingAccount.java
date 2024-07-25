package Advanced_OOP;

public class CheckingAccount extends BankAccount {

    private double insufficient_funds_fee;

    public CheckingAccount(String password, int balance, double insufficient_funds_fee) {
        super(password, balance);
        this.insufficient_funds_fee = insufficient_funds_fee;
    }

    @Override
    public void deposit(double amount){
        double newBalance = getBalance() + amount;
        //updating a balance
        setBalance(newBalance);
        System.out.println("New balance after a deposit is processed is: " + newBalance);
    }

    @Override
    public void withdraw(double amount) {
        double newBalance;
        if (amount > getBalance()) {
            newBalance = getBalance() - amount - insufficient_funds_fee;
        } else {
            newBalance = getBalance() - amount;
        }
        //updating a balance
        setBalance(newBalance);
        System.out.println("New Balance after withdrawal is: " + getBalance());
    }
}
