package Testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class JUnitAnnotations {

    /**
     * @BeforeAll: the part executed only once before any test methods in the test class
     * @BeforeEach: executed before every test case
     * @Aftereach: run after each test for cleanup purposes
     * @AfterAll: similarly, but runs after all tests to cleanup the rest
     * <p>
     * START
     * |
     * BEFORE_CLASS
     * |
     * BEFORE
     * |
     * TEST
     * |
     * AFTER
     * |
     * AFTER_CLASS
     * |
     * STOP
     */

    //placeholder for result variables
    private static int result = 0;

    @BeforeAll
    static void setupClass() {
        System.out.println("Class-level setup");
    }

    @BeforeEach
    void setupMethod() {
        System.out.println("Method-level setup");
    }

    @Test
    void testMethodOne() {
        System.out.println("Test method one executed");
    }

    @Test
    void testMethodTwo() {
        System.out.println("Test method two executed");
    }

    @AfterEach
    void cleanupMethod() {
        System.out.println("method-level cleanup");
    }

    @AfterAll
    static void cleanupClass() {
        System.out.println("method-level cleanup");
    }
}
