package org.javapractices.lab9.quadraticEq;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        double a, b, c;

        WrongType w = new WrongType();

        try {
            QuadraticEquation qadr1 = new QuadraticEquation(1, -3, 2);
            qadr1.solve();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            QuadraticEquation qadr2 = new QuadraticEquation(1, 1, 1);
            qadr2.solve();
        } catch (DiscriminantException e) {
            e.printStackTrace();
        }

        try {
            QuadraticEquation qadr3 = new QuadraticEquation(0, 2, 3);
            qadr3.solve();
        } catch (EqException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Input a, b, c:");
            a = w.readDouble();
            b = w.readDouble();
            c = w.readDouble();

            QuadraticEquation qadr = new QuadraticEquation(a, b, c);
            qadr.solve();
            qadr.printRoots();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
