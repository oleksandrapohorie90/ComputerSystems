package Advanced_OOP;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new SavingsAccount("Savings account", "John Brown", 100000, 4.2);
        System.out.println("Initial savings account details are: \n" + bankAccount.getCustomer_name() + "\n" + bankAccount.getAccount_type() + "\n" +
                bankAccount.balance);

        BankAccount bankAccount2 = new CheckingAccount("Checking account", "Olive Johns", 100050, 24);

        bankAccount2.withdrawal(500);
        System.out.println("Current balance after withdrawal is: "+ bankAccount2.getBalance());

    }
}
