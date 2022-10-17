package org.javapractices.HW1;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter your lastname: ");
        String s = in.nextLine();
        System.out.printf("Hello, %s", s);
    }
}