package org.javapractices.lab9.quadraticEq;

public class EqException extends ArithmeticException{
    private final String details;
    
    EqException(String message){
        details = message;
    }
    
    @Override
    public String toString() {
        return details;
    }
}
