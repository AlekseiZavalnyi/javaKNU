package org.mypackage;

public class Myclass {
    public static void print(){
        System.out.printf("Hello!");
    }
    
    // can only be used in this class
    private static void prPrint(){ 
        System.out.printf("Hello! Its private method"); 
    }
    
    // can only be used in classes of this project and in the subclasses
    protected static void protecPrint(){ 
        System.out.printf("Hello! Its protected method"); 
    }
    
    // can only be used in classes of this project
    void defPrint(){
        System.out.printf("Hello! Its default method");
    }
}