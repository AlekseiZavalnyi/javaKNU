package org.javapractices.lab4;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = in.nextInt();
        int i = 10;
        while (i < 100){
            for (int j = 0; j < n; j++){
                System.out.printf("%d ", i++);
                if (i == 100)
                    break;
            }
            System.out.printf("\n");
        }
    }
}