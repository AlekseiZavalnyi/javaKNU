package org.javapractices.lab10;

import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args){
        String text = "AA aa, b. Ff fsjnf, fd. ka";
        String word = "KA";
        
        System.out.print("Do you want to enter string from a console? ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        if (a.equals("yes")) {
            System.out.print("Input the string: ");
            text = sc.nextLine();

            System.out.print("Input the word to check: ");
            word = sc.next();
        }
        
        
        System.out.print("Case-sensitive: ");
        System.out.println(text.contains(word));

        System.out.print("Ignoring case-sensitive: ");
        System.out.println(text.toLowerCase().contains(word.toLowerCase()));
    }
}
