package org.javapractices.lab3;

public class Task2_3 {
    public static void main(String[] args) {
        printBin('A');
        printBin('$');
    }

    public static void printBin(char c) {
        System.out.println("char: " + Integer.toBinaryString(c));
    }
}