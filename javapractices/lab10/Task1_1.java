package org.javapractices.lab10;
import java.util.StringTokenizer;

public class Task1_1 {
    public static void main(String[] args){
        String text = "A B, C!";
        if (text == null || text.isEmpty())
            System.out.print("There're no words in the text.");
        else {
            StringTokenizer tokens = new StringTokenizer(text);
            System.out.println("There are " + tokens.countTokens() + " in the text.");
        }
    }
}
