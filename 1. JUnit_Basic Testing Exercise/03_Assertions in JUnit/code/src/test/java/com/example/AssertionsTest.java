package com.test.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        assertEquals(10, 5 + 5, "Addition failed");

        assertTrue(10 > 5, "Expression is not true");

        assertFalse(10 < 5, "Expression is not false"); 

        assertNull(null, "Value is not null");

        assertNotNull(new Object(), "Value is null");
    }
}
