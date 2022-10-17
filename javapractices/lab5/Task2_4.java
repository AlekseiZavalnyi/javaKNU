package org.javapractices.lab5;
import java.util.Scanner;
import java.util.Random;

public class Task2_4 {
    public static void main(String args[]) {
        int[][] a;
        a = makeMatrix();
        System.out.print("Matrix A \n");
        displayMatrix(a);

        for (int i = 0; i < a.length; i++){
            System.out.printf("The sum is %d \n", findSum(a, i));
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
    
    public static int findSum(int[][] m, int k){
        int sum = 0;
        for (int i = 0; i < m.length; i++){
            if (m[k][i] >= 0){
                for (int j = i+1; j < m.length; j++){
                    if ((m[k][j] >= 0 && j == m.length - 1) || m[k][j] >= 0)
                        return sum;
                    sum += m[k][j];
                }
            }
        }
        return 0;
    } 
}