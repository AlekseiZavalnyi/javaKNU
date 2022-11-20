package org.javapractices.lab10;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args){
        String text = "A, B C";
        System.out.print("Do you want to enter string from a console? ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        if (a.equals("yes")){
            System.out.print("Input the string: ");
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            System.out.println("Reversed string: " + sb);
        }
        else{
            StringBuilder sb = new StringBuilder(text);
            sb.reverse();
            System.out.println("Reversed string: " + sb);
        }
    }
}
