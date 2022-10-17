package org.javapractices.lab5;
import java.util.Scanner;
import java.util.Random;

public class Task2_2 {
    public static void main(String args[]) {
        int[][] a, b;
        a = makeMatrix();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = in.nextInt();
        
        System.out.print("Matrix A \n");
        displayMatrix(a);
        
        b = rightwardShift(a, k);
        System.out.print("Matrix A after shifting to the right by k positions \n");
        displayMatrix(b);
        
        b = upwardShift(a, k);
        System.out.print("Matrix A after shifting up by k positions \n");
        displayMatrix(b);
        
        b = downwardShift(a, k);
        System.out.print("Matrix A after shifting down by k positions \n");
        displayMatrix(b);
        
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
    
    public static int[][] rightwardShift(int[][] m, int k){
        int n = m.length;
        k %= n;
        int[][] newM = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                newM[i][j] = m[i][(j+k+1)%n];
        }
        return newM;
    }
    
    public static int[][] upwardShift(int[][] m, int k){
        int n = m.length;
        k %= n;
        int[][] newM = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                newM[i][j] = m[(i+(n-k)-1)%n][j];
        }
        return newM;
    }
    
        public static int[][] downwardShift(int[][] m, int k){
        int n = m.length;
        k %= n;
        int[][] newM = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                newM[i][j] = m[(i+k+1)%n][j];
        }
        return newM;
    }
}