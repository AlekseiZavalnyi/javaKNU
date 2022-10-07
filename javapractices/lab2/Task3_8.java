package org.javapractices.lab2;

public class Task3_8 {
    public static void main(String[] args){
        double doubleN = 56.75;
        int intP = (int) doubleN;
        System.out.printf("Number: %f \n", doubleN);
        System.out.printf("Integer part: %d \n", intP);
        System.out.printf("Decimal part: %f ", doubleN - intP);
    }
}