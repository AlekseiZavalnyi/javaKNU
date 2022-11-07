package org.javapractices.HW6;

public class Task3_6 {
    public static void main(String[] args){
        Point a = new Point(new double[] {10, 100, 0}, new double[] {0, 0, 0},
                            new double[] {0, -9.8, 0}, 2);
        Point b = new Point(new double[] {10, 0, 0}, new double[] {0, 8, 0},
                            new double[] {0, 0, 0}, 2);
        
        System.out.printf("%f", a.findDistance(b, 2)); //64.4
    }
}
