package org.javapractices.lab7;

public class Connection {
    private final String message;

    public Connection(String s){
        this.message = s;
    }

    public void show(){
        System.out.printf("Connection message: %s\n", message);
    }
}
