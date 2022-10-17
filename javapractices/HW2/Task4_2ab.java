package org.javapractices.HW2;
import java.util.Scanner;

public class Task4_2ab {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x, y;
        System.out.printf("Enter a value of x: ");
        x = in.nextDouble();
        System.out.printf("Enter a value of y: ");
        y = in.nextDouble();
        
        System.out.printf("a) f(%.3f,%.3f) = %f \n", x, y, partA(x, y));
        System.out.printf("b) f(%.3f,%.3f) = %f \n", x, y, partB(x, y));
    }
    
    public static double partA (double x, double y){
        return Math.pow(x, 3) + Math.pow(y, 3) + 3*Math.pow(x, 2)*y + 3*Math.pow(y, 2)*x;
    }
    
    public static double partB (double x, double y){
        return Math.pow(x, 2)*Math.pow(y, 2) + Math.pow(x, 4)*Math.pow(y, 4) + Math.pow(x, 4)*Math.pow(y, 4);
    }
}