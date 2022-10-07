package org.javapractices.lab3;

public class Task2_2 {
    public static void main(String[] args) {
        int a = 0b1011101;
        while (a != 0) {
            System.out.println("number: " + Integer.toBinaryString(a));
            a = a>>1;
        }
    }
}