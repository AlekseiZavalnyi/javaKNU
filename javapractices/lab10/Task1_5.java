package org.javapractices.lab10;

public class Task1_5 {
    public static void main(String[] args){
        String text = "large A small b";

        String new_text = text.replace("small", "very small").replace("large", "very large");

        System.out.println("New string: "+new_text);
    }
}
