package org.javapractices.lab5;


public class Task3_4 {
    public static void main(String args[]) {
        Myclass cl = new Myclass("Mike"); // prints Hello, Mike
    }
}

class Myclass {
    
    Myclass(){
        System.out.printf("Hello");
    }
    
    Myclass(String s){
        System.out.printf("Hello, %s", s); 
    }
    
}