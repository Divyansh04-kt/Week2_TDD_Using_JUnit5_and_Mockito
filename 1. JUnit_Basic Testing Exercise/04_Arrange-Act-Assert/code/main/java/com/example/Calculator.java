package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup executed before each test.");
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
        System.out.println("Teardown executed after each test.");
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 2, b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result, "Addition failed");
    }

    @Test
    public void testSubtract() {
        // Arrange
        int a = 5, b = 3;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(2, result, "Subtraction failed");
    }
}
