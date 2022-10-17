package org.javapractices.lab5;


public class Task3_2 {
    public static void main(String args[]) {
        Myclass cl = new Myclass();
        cl.displayInf();
    }
}

class Myclass {
    String s;
    
    Myclass(){
        String k = "Hello!";
    }
    
    void displayInf(){
        System.out.printf("%s \n", s);
        //System.out.printf("%s \n", k); error: cannot find symbol k
    }
    
}