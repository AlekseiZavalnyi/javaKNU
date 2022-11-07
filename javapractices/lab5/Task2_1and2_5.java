package org.javapractices.lab5;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task2_1and2_5 {
    public static void main(String args[]) {
        int[][] a;
        a = makeMatrix();
        System.out.print("Matrix A \n");
        displayMatrix(a);
        
        System.out.print("Matrix A after transpose \n");
        displayMatrix(transposeMatrix(a));
        
        System.out.print("Matrix A after sorting rows \n");
        for (int i = 0; i < a[0].length; i++)
            Arrays.sort(a[i]);
        displayMatrix(a);
        
        System.out.print("Matrix A after sorting columns \n");
        a = transposeMatrix(a);
        for (int i = 0; i < a[0].length; i++)
            Arrays.sort(a[i]);
        a = transposeMatrix(a);
        displayMatrix(a);
        
    }
    
    public static int[][] makeMatrix(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        Random random = new Random();
        int[][] mtx = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                mtx[i][j] = random.nextInt(n - (-n)) - n;
        }
        return mtx;
    }
    
    public static void displayMatrix(int[][] mtx){
        int n = mtx[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                System.out.printf("%4d ", mtx[i][j]);
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
    
    public static int[][] transposeMatrix(int[][] m){
        int n = m.length;
        int[][] mT = new int[n][n];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++)
                mT[j][i] = m[i][j];
        }
        return mT;
    }
}