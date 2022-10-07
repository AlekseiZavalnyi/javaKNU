package org.javapractices.lab4;
import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = in.nextInt();
        int i = 1;
        while (i < 1000){
            for (int j = 0; j < n; j++){
                if (i < 10)
                    System.out.printf("%d   ", i++);
                else if (i > 9 && i < 100)
                    System.out.printf("%d  ", i++);
                else if (i > 99 && i < 1000)
                    System.out.printf("%d ", i++);
                else
                    break;
            }
            System.out.printf("\n");
        }
    }
}