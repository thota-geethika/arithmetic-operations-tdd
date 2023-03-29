package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationsTest {

    ArithmeticOperations arithmeticObject = new ArithmeticOperations();

    @Nested
    class Addition {
        @Test
        void toReturnNineWhenFourIsAddedToFive() {
            //AAA format
            //Arrange
            int expectedSum = 9;

            //Act
            int actualSum = arithmeticObject.add(4, 5);

            //Assert
            assertEquals(expectedSum, actualSum);
        }
    }


    @Nested
    class Subtraction {
        @Test
        void toReturnFiveWhenFifteenIsSubtractedFromTen() {
            //Arrange
            int expectedDifference = 5;

            //Act
            int actualDifference = arithmeticObject.subtract(15, 10);

            //Assert
            assertEquals(expectedDifference, actualDifference);
        }

        @Test
        void toReturnMinusSevenWhenNineteenIsSubtractedFromTwelve() {
            //Arrange
            int expectedValue = -7;

            //Act
            int actualValue = arithmeticObject.subtract(12, 19);

            //Assert
            assertEquals(expectedValue, actualValue);
        }
    }

    @Nested
    class Multiplication {
        @Test
        void toReturnFifteenWhenThreeIsMultipliedByFive() {
            //Arrange
            long expectedValue = 15;

            //Act
            long actualValue = arithmeticObject.multiply(3, 5);

            //Assert
            assertEquals(expectedValue, actualValue);
        }


        //Testcase 2 - when one positive and one negative number is multiplied
        @Test
        void toReturnMinus20WhenFourIsMultipliedByMinusFive() {
            //Arrange
            long expectedValue = -20;

            //Act
            long actualValue = arithmeticObject.multiply(4, -5);

            //Assert
            assertEquals(expectedValue, actualValue);
        }

        //Testcase 3 - when two negative numbers are multiplied
        @Test
        void toReturnFortyTwoWhenSevenIsMultipliedBySix() {
            //Arrange
            long expectedValue = 42;

            //Act
            long actualValue = arithmeticObject.multiply(7, 6);

            //Assert
            assertEquals(expectedValue, actualValue);
        }

        //Testcase 4 - when one number is zero
        @Test
        void toReturnZeroTwoWhenZeroIsMultipliedBySix() {
            //Arrange
            long expectedValue = 0;

            //Act
            long actualValue = arithmeticObject.multiply(0, 6);

            //Assert
            assertEquals(expectedValue, actualValue);
        }
    }


    @Nested
    class Division {
        @Test
        void toReturnThreeWhenNineIsDividedByThree() {
            //Arrange
            double expectedValue = 3;

            //Act
            double actualValue = arithmeticObject.divide(9, 3);

            //Assert
            assertEquals(expectedValue, actualValue);
        }

        //Test case3 - when both numbers are negative
        @Test
        void toReturnThreeWhenMinusNineIsDividedByMinusThree() {
            //Arrange
            double expectedValue = 3;

            //Act
            double actualValue = arithmeticObject.divide(-9, -3);

            //Assert
            assertEquals(expectedValue, actualValue);
        }

        //Test case3 - when one number is negative and one number is positive
        @Test
        void toReturnMinusFourWhenEightIsDividedByMinusTwo() {
            //Arrange
            double expectedValue = -4;

            //Act
            double actualValue = arithmeticObject.divide(8, -2);

            //Assert
            assertEquals(expectedValue, actualValue);
        }

        //Test case 4 - when the divisor is zero
        @Test
        void toThrowExceptionWhenDivideByZero() {
            assertThrows(ArithmeticException.class, () -> arithmeticObject.divide(5, 0));
        }
    }
}
