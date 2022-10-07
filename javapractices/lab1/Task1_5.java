package org.javapractices.lab1;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            String str = in.nextLine();
            System.out.printf("Argument %d: %s\n", i+1, str);
        }
    }
}