package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {

    ArithmeticOperations arithmeticObject = new ArithmeticOperations();


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

    //Testcase 1 - when the result of subtraction is a positive number
    @Test
    void toReturnFiveWhenFifteenIsSubtractedFromTen()
    {
        //Arrange
        int expectedValue = 5;

        //Act
        int actualValue = arithmeticObject.subtract(15,10);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //Testcase 2 - when the result of the subtraction is a negative number
    @Test
    void toReturnMinusSevenWhenNineteenIsSubtractedFromTwelve()
    {
        //Arrange
        int expectedValue = -7;

        //Act
        int actualValue = arithmeticObject.subtract(12,19);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //Testcases for Multiplication

    //Testcase 1 - when two positive numbers are multiplied
    @Test
    void toReturnFifteenWhenThreeIsMultipliedByFive()
    {
        //Arrange
        long expectedValue = 15;

        //Act
        long actualValue = arithmeticObject.multiply(3,5);

        //Assert
        assertEquals(expectedValue,actualValue);
    }


    //Testcase 2 - when one positive and one negative number is multiplied
    @Test
    void toReturnMinus20WhenFourIsMultipliedByMinusFive()
    {
        //Arrange
        long expectedValue = -20;

        //Act
        long actualValue = arithmeticObject.multiply(4,-5);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //Testcase 3 - when two negative numbers are multiplied
    @Test
    void toReturnFortyTwoWhenSevenIsMultipliedBySix()
    {
        //Arrange
        long expectedValue = 42;

        //Act
        long actualValue = arithmeticObject.multiply(7,6);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //Testcase 4 - when one number is zero
    @Test
    void toReturnZeroTwoWhenZeroIsMultipliedBySix()
    {
        //Arrange
        long expectedValue = 0;

        //Act
        long actualValue = arithmeticObject.multiply(0,6);

        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
