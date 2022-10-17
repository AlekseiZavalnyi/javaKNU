package org.javapractices.lab4;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
            
        double mean = 0;
        for (int num : arr)
            mean += num;
        mean /= n;
        
        int s = 0;
        for (int num : arr)
            s += Math.pow(num - mean, 2);
        
        System.out.printf("Mean = %f\nStandart deviation = %f", mean, Math.sqrt(s/(n - 1)));
    }
}