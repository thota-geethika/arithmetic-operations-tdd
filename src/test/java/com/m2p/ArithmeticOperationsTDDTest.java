package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTDDTest {

    ArithmeticOperationsTDD arithmeticObject = new ArithmeticOperationsTDD();

    @Test
    // Test case For addition
    void toReturnNineWhenFourIsAddedToFive()
    {
        //AAA format
        //Arrange
        int expectedValue = 9;

        //Act
        int actualValue = arithmeticObject.add(4,5);

        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
