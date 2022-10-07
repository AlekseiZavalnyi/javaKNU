package org.javapractices.lab4;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter numbers: ");
        
        String str = in.nextLine();
        
        String[] numsStr = str.split(" ");
        int[] numbers  = new int[numsStr.length];
        for(int i = 0; i < numsStr.length; i++)
            numbers[i] = Integer.parseInt(numsStr[i]);
            
        int count = 1, max = 1, x = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1])
                count++;
            else {
                if (count > max){
                    max = count;
                    if (numbers[i] > x)
                        x = numbers[i];
                }
                count = 1;
            }
        }
        System.out.printf("max num is %d with a sequence length of %d", x, max);
    }
}