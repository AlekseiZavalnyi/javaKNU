package org.javapractices.lab1;
import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String a = in.nextLine();
        System.out.printf("Hello, %s!", a);
    }
}