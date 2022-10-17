package org.javapractices.lab3;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n and m: ");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Number n: " + n);
        
        int new_n = n ^ (1 << m);
        System.out.println("New number: " + new_n);
    }
}