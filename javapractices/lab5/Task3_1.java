package org.javapractices.lab5;


public class Task3_1 {
    public static void main(String args[]) {
        Myclass cl = new Myclass();
        cl.displayInf();
    }
}

class Myclass {
    String s;
    void displayInf(){
        System.out.printf("%s", s); // prints null
    }
}