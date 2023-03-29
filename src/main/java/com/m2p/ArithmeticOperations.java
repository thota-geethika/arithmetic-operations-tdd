package com.m2p;

public class ArithmeticOperations {
    public int add(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public long multiply(long firstNumber, long secondNumber) {

        return firstNumber * secondNumber;
    }


    public double divide(double firstNumber, double secondNumber) {

        if(secondNumber == 0)
        {
            throw new ArithmeticException();
        }
        return firstNumber/secondNumber;
    }
}
