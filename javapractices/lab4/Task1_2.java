package org.javapractices.lab4;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter numbers: ");
        
        String str = in.nextLine();
        
        String[] numsStr = str.split(" ");
        int[] numbers  = new int[numsStr.length];
        for(int i = 0; i < numsStr.length; i++)
            numbers[i] = Integer.parseInt(numsStr[i]);
        
        
        int max = numbers[0], min = numbers[0];
        for (int num : numbers){
            if (max < num)
                max = num;
            else if (min > num)
                min = num;
        }
        
        System.out.printf("min = %d\nmax = %d", min, max);
    }
}