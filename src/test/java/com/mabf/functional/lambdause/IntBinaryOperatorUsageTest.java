package com.mabf.functional.lambdause;


import org.junit.Before;
import org.junit.Test;

import java.util.function.IntBinaryOperator;

import static org.junit.Assert.assertEquals;

public class IntBinaryOperatorUsageTest {

    private IntBinaryOperator addOperator;
    private IntBinaryOperator subtractOperator;
    private IntBinaryOperator multiplyOperator;
    private IntBinaryOperator divideOperator;

    @Before
    public void setUp() {
        addOperator = (a, b) -> a + b;
        subtractOperator = (a, b) -> a - b;
        multiplyOperator = (a, b) -> a * b;
        divideOperator = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return a / b;
        };
    }

    @Test
    public void calculate_AddOperator_ReturnsSum() {
        int result = IntBinaryOperatorUsage.calculate(addOperator, 5, 3);
        assertEquals(8, result);
    }

    @Test
    public void calculate_SubtractOperator_ReturnsDifference() {
        int result = IntBinaryOperatorUsage.calculate(subtractOperator, 5, 3);
        assertEquals(2, result);
    }

    @Test
    public void calculate_MultiplyOperator_ReturnsProduct() {
        int result = IntBinaryOperatorUsage.calculate(multiplyOperator, 5, 3);
        assertEquals(15, result);
    }

    @Test
    public void calculate_DivideOperator_ReturnsQuotient() {
        int result = IntBinaryOperatorUsage.calculate(divideOperator, 10, 2);
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculate_DivideOperator_DivideByZero_ThrowsException() {
        IntBinaryOperatorUsage.calculate(divideOperator, 10, 0);
    }

    @Test
    public void calculate_CustomOperator_ReturnsCorrectResult() {
        IntBinaryOperator customOperator = (a, b) -> a * a + b * b;
        int result = IntBinaryOperatorUsage.calculate(customOperator, 2, 3);
        assertEquals(13, result);
    }
}
