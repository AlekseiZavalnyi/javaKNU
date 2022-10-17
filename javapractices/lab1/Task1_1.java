package org.javapractices.lab1;

public class Task1_1 {
    public static int a;
    public static char b;
    public static String str;
    public static void main(String[] args){
        helpfulFunc();
    }
    
    public static void helpfulFunc(){
        String s = "int = " + a + " char = " + b + " string = %s" + str;
        System.out.print(s);
    }
}