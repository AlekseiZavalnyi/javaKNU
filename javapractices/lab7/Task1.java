package org.javapractices.lab7;

public class Task1 {
    public static void main(String[] args){
        String[] messages = {"One", "Two", "Three"};
        ConnectionManager cm = new ConnectionManager(messages);
        while(cm.existConnection()){
            ConnectionManager.getConnection().show();
        }
    }
}
