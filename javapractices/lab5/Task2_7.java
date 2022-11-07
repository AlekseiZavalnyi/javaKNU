package org.javapractices.lab5;
import java.util.Scanner;
import java.util.Random;

public class Task2_7 {
    public static void main(String args[]) {
        int[][] a;
        a = makeMatrix();
        displayMatrix(a);
        
        for (int i = 1; i < 4; i++){
            System.out.printf("Matrix A rotated %d degrees \n", (4-i)*90);
            displayMatrix(rotateMatrix(a, i));
        }
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
    
    public static int[][] rotateMatrix(int[][] m, int k){
        int[][] mR = new int[m.length][m.length];
        if (k == 0)
            return m;
        else {
            int n = m.length;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++)
                    mR[j][n-i-1] = m[i][j];
            }
        }
        return rotateMatrix(mR, k-1);
    }
}