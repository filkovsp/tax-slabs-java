package org.example.service;

import org.example.factory.BasicSlabFactory;
import org.example.factory.SlabFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorImplTest {


    @Test
    @DisplayName("Should succeed for all assertions")
    public void testOne() {
        SlabFactory basicSlabFactory = new BasicSlabFactory();
        Calculator calculator = new CalculatorImpl(basicSlabFactory);

        double expectedTax = 75.0;
        double actualTax = calculator.calculateTax(500.0);
        assertEquals(expectedTax, actualTax);

        expectedTax = 40.0;
        actualTax = calculator.calculateTax(350.0);
        assertEquals(expectedTax, actualTax);


        expectedTax = 10.0;
        actualTax = calculator.calculateTax(200.0);
        assertEquals(expectedTax, actualTax);
    }

    @Nested
    class EdgeCases {

        // we can test `null` income value
        // or

    }

}