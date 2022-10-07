package org.javapractices.HW4;
import java.util.Scanner;

public class Task1_12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = in.nextInt();
        System.out.print("Lines: \n");
        
        int numOfWords = 0, numOfSymb = 0;
        for (int i = 0; i < n + 1; i++){
            String str = in.nextLine();
            String[] words = str.split(" ");
            for (String word : words)
                numOfSymb += word.length();
            numOfWords += words.length;
        }
        System.out.printf("Number of words: %d. Nuber of symbols: %d", numOfWords-1, numOfSymb);
    }
}