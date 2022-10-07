package org.javapractices.lab3;

public class Task2_1 {
    public static void main(String[] args) {
        int a = 0b110101, b = 0b101110;
        System.out.println("and: " + Integer.toBinaryString(a&b));
        System.out.println("or: " + Integer.toBinaryString(a|b));
        System.out.println("xor: " + Integer.toBinaryString(a^b));
    }
}