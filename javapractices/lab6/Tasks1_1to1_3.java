package org.javapractices.lab6;
import org.mypackage.Myclass;

public class Tasks1_1to1_3 {
    public static void main(String[] args){
        Myclass cl = new Myclass();
        cl.print(); // prints Hello!
        
        /*
        // Uncompilable code - defPrint() is not public in org.mypackage.Myclass
        cl.defPrint();
        
        // Uncompilable code - protecPrint() has protected access in org.mypackage.Myclass
        cl.protecPrint();
        
        // Uncompilable code - prPrint() has private access in org.mypackage.Myclass
        cl.prPrint();
        */
        
    }
}