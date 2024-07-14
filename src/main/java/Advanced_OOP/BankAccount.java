package Advanced_OOP;

public abstract class BankAccount {

    String customer_name;
    String account_type;
    int balance;

    abstract void deposit(int amount);

    abstract void withdrawal(int amount);

    public BankAccount(String account_type, String customer_name, int balance) {
        this.account_type = account_type;
        this.customer_name = customer_name;
        this.balance = balance;
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
