package org.javapractices.HW3;
import java.util.Scanner;

public class Task3_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float arr[];
        arr = new float[6];
        for (int i = 0; i < 6; i++){
            System.out.printf("Enter a score: ");
            float num = in.nextFloat();
            arr[i] = num;
        }
        
        float min = arr[0], max = arr[0];
        for (float i : arr){
            if (i > max)
                max = i;
            else if (i < min)
                min = i;
        }
        
        float eps = (float) 0.0001;
        float mean = 0;
        for (float i: arr){
            if ((max - i) > eps && (i - min) > eps)
                mean += i;
        }
        
        System.out.printf("Mean: %f", mean/4);
    }
}