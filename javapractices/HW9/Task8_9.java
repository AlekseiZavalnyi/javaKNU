package org.javapractices.HW9;

public class Task8_9 {
    public static void main(String[] args){
        Mobile m = new Mobile(3);
        m.addPhone("A", "country1", 150.150);
        m.addPhone("B", "country1", 149.149);
        m.addPhone("C", "country2", 200.200);
        
        System.out.print(m);
    }
}
