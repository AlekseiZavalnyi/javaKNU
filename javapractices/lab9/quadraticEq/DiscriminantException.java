package org.javapractices.lab9.quadraticEq;

public class DiscriminantException extends ArithmeticException{
    private double d;

    DiscriminantException(String message, double d) {

        this.d = d;
    }

    @Override
    public String toString() {
        return "Discriminant is " + d;
    }
}
