package org.javapractices.lab10;

public class Task1_3 {
    public static void main(String[] args){
        String text = "small A, big B";

        String new_text = text.replace("small", "very large");
        System.out.println("New string: "+ new_text);
    }
}
