package org.javapractices.HW5;

public class Task3_9 {
    String s;
    
    public void print(String a){
        System.out.println(s + a);
    }
    
    public void printX2(String a){
        print(a);
        this.print(a);
    }
}
