package org.javapractices.lab10;

public class Task1_4 {
    public static void main(String[] args){
        String r = "\\s+(a(|n))\\s+";
        String text = "an apple a book";
        
        String[] parts = text.split(r);
        String res = String.join(" ",parts);
        System.out.println(res);
    }
}
