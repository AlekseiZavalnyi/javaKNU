package org.javapractices.lab6;

class Myclass{
    protected int x = 2;
    protected void f(int y){
        x = 5 + y;
        System.out.printf("result: %d\n", x);
    }
}
public class Task1_4 {
    public static void main(String[] args){
        Myclass cl = new Myclass();
        cl.f(5); // result: 10
    }
}
