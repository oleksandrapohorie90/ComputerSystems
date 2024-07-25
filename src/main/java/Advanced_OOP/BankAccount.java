package Advanced_OOP;

public abstract class BankAccount implements Account {

    private double balance;
    protected String password;

    //parameterized constructor
    public BankAccount(String password, int balance) {
        this.balance = balance;
        this.password = password;
    }

    //default constructor
    public BankAccount() {
    }

    //copy object constructor
    public BankAccount(BankAccount bank_account) {
        this.password = bank_account.password;
        this.balance = bank_account.balance;
    }

    //overriding methods from Account interface
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    //Getter and Setter methods
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void changePassword(String currentPassword, String newPassword) {
        //assuming any password will meet the requirements for now
        if (this.password.equals(currentPassword)) {
            this.password = newPassword;
        } else {
            System.out.println("Please re-enter the current password!");
        }
    }

    public abstract void withdrawal(int amount);

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
