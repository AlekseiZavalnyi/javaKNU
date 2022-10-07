package org.javapractices.lab2;
import java.util.Scanner;

public class Task3_7 {
    public static void main(String[] args){
        double m1, m2, R, gamma = 6.673e-11;
        Scanner in = new Scanner(System.in);
        System.out.printf("Введіть m1: ");
        m1 = in.nextDouble();
        System.out.printf("Введіть m2: ");
        m2 = in.nextDouble();
        System.out.printf("Введіть R: ");
        R = in.nextDouble();
        
        System.out.printf("\nF = %.4f ", (float) (m1 * m2 * gamma) / (R*R));
    }
}