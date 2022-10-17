package org.javapractices.HW4;

public class Task4_9 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
        System.out.printf("roll %d: %d \n", i+1, roll());
    }
    
    public static int roll() {
        double x = Math.random();
        for (int i = 1; i < 7; i++){
            if (x < i / 8.0)
                return i;
        }
        return 6;
    }
}