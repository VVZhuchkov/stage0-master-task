package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int number = 1;
        for (int i = 0; i < power; i++){
            number = number*numberToPrint;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
