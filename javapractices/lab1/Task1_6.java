package org.javapractices.lab1;
import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a: ");
        int a = in.nextInt();
        System.out.printf("Enter b: ");
        int b = in.nextInt();
        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}