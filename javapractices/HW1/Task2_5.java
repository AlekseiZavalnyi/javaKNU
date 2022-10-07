package org.javapractices.HW1;
import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of items: ");
        int n = in.nextInt();
        
        String arr[];
        arr = new String[n];
        
        for (int i = n; i > 0; i--){
            String x = in.nextLine();
            arr[i - 1] = x;
        }
        
        for (String s : arr)
            System.out.printf("%s ", s);
    }
}