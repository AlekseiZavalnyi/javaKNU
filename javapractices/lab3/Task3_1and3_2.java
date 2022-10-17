package org.javapractices.lab3;

public class Task3_1and3_2 {
    public static void main(String[] args){
        System.out.print("Task 3.1: ");
        numbers();
        System.out.print("Task 3.2: \n");
        randomNumbers();
    }
    
    public static void numbers(){ // prints numbers from 1 to 100
        for (int i = 1; i < 100; i++)
            System.out.printf("%d ", i);
        System.out.printf("\n");
    }
    
    public static void randomNumbers(){ // prints 25 random numbers and compares them 
        int a = (int) (Math.random());
        for (int i = 0; i < 24; i++){
            int b = (int) (Math.random() * 101);
            if (b > a)
                System.out.printf("%d < %d \n", a, b);
            else if (a > b)
                System.out.printf("%d > %d \n", a, b);
            else
                System.out.printf("%d == %d \n", a, b);
            
            a = b;
        }
        System.out.printf("\n");
    }
}
