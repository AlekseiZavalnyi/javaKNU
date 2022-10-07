package org.javapractices.HW1;
import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter number a: ");
        float a = in.nextFloat();
        System.out.printf("Enter number b: ");
        float b = in.nextFloat();

        System.out.printf("Geometric mean (a, b) : %e \n", Math.sqrt(a*b));
        System.out.printf("Geometric mean (a, b) : %f", Math.sqrt(a*b));
        
    }
}