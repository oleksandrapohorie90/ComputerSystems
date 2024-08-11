import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CalculatorTest {

    @Test
    @DisplayName("Multiply two numbers")
    public void multiply() {
        assertAll(
                () -> assertEquals(4.0, Calculator.multiply(2, 2), 0.0001),
                () -> assertEquals(-4.0, Calculator.multiply(2, -2), 0.0001),
                () -> assertEquals(4.0, Calculator.multiply(-2, -2), 0.0001),
                () -> assertEquals(0.0, Calculator.multiply(1, 0), 0.0001)
        );
    }

    @Test
    @DisplayName("Add two numbers")
    public void add() {
        assertEquals(4.0, Calculator.add(2, 2), 0.0001);
    }
}
