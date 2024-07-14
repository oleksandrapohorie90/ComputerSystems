package Advanced_OOP;

public class Main {
    public static void main(String[] args) {

        BankAccount savingsAccount = new SavingsAccount("Savings account", "John Brown", 100000, 4.2);
        System.out.println("Initial savings account details are: \n" + savingsAccount.getCustomer_name() + "\n" + savingsAccount.getAccount_type() + "\n" +
                savingsAccount.getBalance());

        BankAccount checkingAccount = new CheckingAccount("Checking account", "Olive Johns", 100050, 24);

        checkingAccount.withdrawal(500);
        System.out.println("Current balance after withdrawal is: "+ checkingAccount.getBalance());

        savingsAccount.deposit(1000);
        System.out.println("Balance after deposit: "+ savingsAccount.getBalance());

        SavingsAccount savings = (SavingsAccount) savingsAccount;
        savings.calculate_interest();
    }
}
