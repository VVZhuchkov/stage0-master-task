package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int third = number % 100 % 10;
        int second = number % 100 / 10;
        int first = number / 100;
        System.out.println(""+third+second+first);
    }
}
