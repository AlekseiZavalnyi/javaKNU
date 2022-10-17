package org.javapractices.lab4;
import java.util.Scanner;
import java.util.Arrays;

public class Task1_5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //System.out.printf("Enter the number of points: ");
        //int n = in.nextInt();
        int n = 3;
        
        System.out.printf("Enter the point: ");
        String str = in.nextLine();
        String[] pointStr = str.split(" ");
        double[] point  = new double[pointStr.length];
        for(int i = 0; i < pointStr.length; i++)
            point[i] = Double.parseDouble(pointStr[i]);
            
        double d_min = Double.POSITIVE_INFINITY;
        double[] nearestP = new double[point.length];
        
        System.out.printf("Enter another points: ");
        for (int i = 0; i < n; i++){
            str = in.nextLine();
            String[] anotherpointStr = str.split(" ");
            double[] anotherpoint  = new double[anotherpointStr.length];
            for(int j = 0; j < anotherpointStr.length; j++)
                anotherpoint[j] = Double.parseDouble(anotherpointStr[j]);
                
            double d = findDistance(point, anotherpoint);
            if (d < d_min){
                d_min = d;
                nearestP = anotherpoint;
            }
                
        }
        
        System.out.print("The nearest point to the point ");
        System.out.println(Arrays.toString(point));
        System.out.print(" is ");
        System.out.println(Arrays.toString(nearestP));
        System.out.printf(" with distance %f", d_min);
    }
    
    public static double findDistance(double[] x, double[] y){
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += Math.pow((x[0] - y[0]), 2);
        return Math.sqrt(sum);
    }
}