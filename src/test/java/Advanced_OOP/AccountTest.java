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
}
