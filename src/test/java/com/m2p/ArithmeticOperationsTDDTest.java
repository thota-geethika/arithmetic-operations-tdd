package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTDDTest {

    ArithmeticOperationsTDD arithmeticObject = new ArithmeticOperationsTDD();


    // Test case For addition
    @Test
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


    //Testcases for Subtraction
    @Test
    //Testcase 1
    void toReturnFiveWhenFifteenIsSubtractedFromTen()
    {
        //Arrange
        int expectedValue = 5;

        //Act
        int actualValue = arithmeticObject.subtract(15,10);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    //Testcase 2
    void toReturnMinusSevenWhenNineteenIsSubtractedFromTwelve()
    {
        //Arrange
        int expectedValue = -7;

        //Act
        int actualValue = arithmeticObject.subtract(12,19);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

}
