package Advanced_OOP;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    @DisplayName("Test deposit functionality")
    public void deposit() {
        // Create an instance of BankAccount
        Account account = new CheckingAccount("test", 500, 45);

        // Test deposit method and assert after each operation
        account.deposit(500);
        assertEquals(1000.0, account.getBalance(), 0.001, "Balance after first deposit");

        account.deposit(0);
        assertEquals(1000.0, account.getBalance(), 0.001, "Balance after depositing 0");

        account.deposit(1400);
        assertEquals(2400.0, account.getBalance(), 0.001, "Balance after third deposit");

        account.deposit(600);
        assertEquals(3000.0, account.getBalance(), 0.001, "Balance after fourth deposit");
    }

    @Test
    void withdraw() {
        // Create an instance of BankAccount
        Account account = new CheckingAccount("test2", 600, 45);

        // Test deposit method and assert after each operation
        account.withdraw(100);
        assertEquals(500, account.getBalance(), 0.001, "Balance after first withdraw");

        account.withdraw(0);
        assertEquals(500, account.getBalance(), 0.001, "Balance after withdraw 0");

        account.withdraw(500);
        assertEquals(0, account.getBalance(), 0.001, "Balance after third withdraw");

        account.withdraw(1);
        assertEquals(-46, account.getBalance(), 0.001, "Balance after third withdraw");
    }

    @Test
    void calculate_interest() {
        // Create an instance of BankAccount
        SavingsAccount account = new SavingsAccount("test2", 50000, 0.47);

        // Test deposit method and assert after each operation
        assertEquals(2350.0, account.calculate_interest(10), 0.001, "New savings account balance is: ");
        assertEquals(470.0, account.calculate_interest(2), 0.001, "New savings account balance is: ");
    }

    @Test
    void changePassword() {

    }
}
