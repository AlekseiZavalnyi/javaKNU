package org.javapractices.lab2;
import java.util.Scanner;


public class Task4_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("c: ");
        double c = in.nextDouble();
        if (checkValidity(a, b, c) == 1)
            System.out.printf("Area of the triangle: %.5f \n", triangleArea(a, b, c));
        else
            System.out.printf("The sides aren't the sides of a triangle \n");
        in.close();
    }
    
    public static int checkValidity(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }
    
    public static double triangleArea(double a, double b, double c) {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
