package org.javapractices.lab2;
import java.util.Scanner;

public class Task3_3and3_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Введіть ім'я: ");

        String userName = in.nextLine();
        System.out.printf("Привіт, " + userName + "!");
        
        System.out.printf("\n!!! Hello, " + userName + " !!!");
    }
}