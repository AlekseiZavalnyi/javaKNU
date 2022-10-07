package org.javapractices.lab4;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = in.nextInt();
        
        String[] arr = new String[n];
        
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Enter a word: ");
            arr[i] = in.nextLine();
        }
            
        for (String s: arr)
            System.out.printf("%s \n", s);
    }
}