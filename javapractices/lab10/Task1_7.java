package org.javapractices.lab10;

import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args){
        String text = "AA aa, b. Ff fsjnf, fd. ka!";
        
        System.out.print("Do you want to enter string from a console? ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        if (a.equals("yes")){
            System.out.print("Input the string: ");
            text = sc.nextLine();
        } 
        
        System.out.println("The number of characters in text: " + countChars(text));
        System.out.println("The number of words in text: " + countWords(text));
        System.out.println("The number of punctuation marks in text: " + countPunctMarks(text));
        System.out.println("The number of sentences in text: " + countSentences(text));
    }
    
    
    public static int countChars(String text){
        String[] words = text.split(" ");
        String str = String.join("", words);
        return str.length();
    }

    public static int countWords(String text){
        String r = "[\\p{Punct}\\s]+";
        String[] words = text.split(r);
        return words.length;
    }

    public static int countPunctMarks(String text){
        String r = "[\\p{Punct}]+";
        String[] words = text.split(r);
        return words.length-1;

    }

    public static int countSentences(String text){
        String r = "[.?!]";
        String[] sentences = text.split(r);
        return sentences.length;
    }
}
