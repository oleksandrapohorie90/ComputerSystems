package Advanced_OOP;

public class Bank {
    public static void main(String[] args) {

        User customer = new User("Alex");

        //polymorphism
        BankAccount bankAccount = new CheckingAccount("122334", 5000, 29);

        Account savingsAcc = new SavingsAccount("9876", 100000, 4.7);
        Account checkingAcc = new CheckingAccount("54321", 10000, 45);

        customer.openAccount(savingsAcc);
        customer.openAccount(checkingAcc);

        System.out.print("All Customer " + customer.getCustomer_name() + " accounts: " + customer.getAccountsType());
        customer.displayAllAccountTypes();

        savingsAcc.deposit(1000);
        System.out.println("Balance after deposit on the Savings account: " + savingsAcc.getBalance());

        checkingAcc.withdraw(500);
        System.out.println("Balance after withdrawal on the Checking account: " + savingsAcc.getBalance());
        checkingAcc.changePassword("123444", "78uu89s");

    }
}
