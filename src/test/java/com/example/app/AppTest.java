package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testApp() {
        // A simple test to check a basic condition.
        assertEquals(1, 1, "Basic sanity test");
    }

    @Test
    public void testCalculatorAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);
        // Verify that 3 + 4 equals 7.
        assertEquals(7, result, "3 + 4 should equal 7");
    }
}
