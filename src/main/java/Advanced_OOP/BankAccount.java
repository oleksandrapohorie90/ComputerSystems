package Advanced_OOP;

public abstract class BankAccount {

    String customer_name;
    String account_type;
    int balance;

    abstract void deposit(int amount);

    abstract void withdrawal(int amount);

    //parameterized
    public BankAccount(String account_type, String customer_name, int balance) {
        this.account_type = account_type;
        this.customer_name = customer_name;
        this.balance = balance;
    }

    //default
    public BankAccount() {
    }

    //copy object
    public BankAccount(BankAccount bank_account) {
        this.customer_name = bank_account.customer_name;
        this.account_type = bank_account.account_type;
        this.balance = bank_account.balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getAccount_type() {
        return account_type;
    }

    public int getBalance() {
        return balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
