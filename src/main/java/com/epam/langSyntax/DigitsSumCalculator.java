package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int fourth = number % 1000 % 100 % 10;
        int third = number % 1000 % 100 / 10;
        int second = number % 1000 / 100;
        int first = number / 1000;
        System.out.println(fourth + third + second + first);
    }
}
