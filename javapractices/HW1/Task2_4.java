package org.javapractices.HW1;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter an integer: ");
        int a = in.nextInt();

        System.out.printf("F = %.3f", 1.8 * a + 32);
    }
}