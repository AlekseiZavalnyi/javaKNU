package org.javapractices.HW1;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter number a: ");
        int a = in.nextInt();
        System.out.printf("Enter number b: ");
        int b = in.nextInt();
        
        System.out.printf("The number of digits in the number a: %d \n", findLength(a));
        System.out.printf("The number of digits in the number b: %d \n", findLength(b));
        System.out.printf("Harmonic mean (a, b) : %.2f", (float) 2*a*b / (a + b));
        
    }
    
    public static int findLength(int x){
        int k = 0;
        while (x != 0){
            x /= 10;
            k += 1;
        }
        return k;
    }
}