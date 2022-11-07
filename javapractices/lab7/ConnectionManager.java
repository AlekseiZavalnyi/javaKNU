package org.javapractices.lab7;

public class ConnectionManager {
    private static  Connection[] connections;
    private static int current;


    public ConnectionManager(String[] messages) {
        Connection[] tempConnections = new Connection[messages.length];
        for(int i = 0; i < messages.length; i++){
            tempConnections[i] = new Connection(messages[i]);
        }
        connections = tempConnections;
        current = 0;
    }

    public static Connection getConnection(){
        assert (current < connections.length) : "Out of range";
        return connections[current++];
    }

    public Boolean existConnection(){
        return (current < connections.length) && (connections.length != 0);
    }
}
