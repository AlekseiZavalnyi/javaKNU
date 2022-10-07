package org.javapractices.HW3;
import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //long a = in.nextLong();
        //int k = in.nextInt();
        long a = 464684318;
        int k = 5;
        long g = 0;
        if (Math.pow(10, k+1) < a){
            while (k != 0){
                g = a%10;
                a = a / 10;
                k -= 1;
            }
        }
        System.out.println("k-th digit: " + g); //8
    }
}