package org.javapractices.HW1;
import java.util.Scanner;

public class Task2_6and2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of r.v. : ");
        int n = in.nextInt();
        
        
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", (int) Math.floor(Math.random()*(101))); 
        
        System.out.printf("\n");
        
        long prod = 1;
        for (int i = 0; i < n; i++){
            int x = (int) Math.floor(Math.random()*(101));
            System.out.printf("%d \n", x); 
            prod *= x;
        }
        
        System.out.printf("Product of the last %d numbers = %d", n, prod);
    }
}