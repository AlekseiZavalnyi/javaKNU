package org.javapractices.lab5;
import java.util.Scanner;
import java.util.Random;

public class Task2_3 {
    public static void main(String args[]) {
        int[][] a;
        a = makeMatrix();
        System.out.print("Matrix A \n");
        displayMatrix(a);

        System.out.printf("The length of the largest increasing sequence is %d", findSequence(a));
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
    
    public static int findSequence(int[][] m){
        int a = m[0][0], b, k = 0, max_k = 0;
        int n = m.length;
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                b = m[i][j];
                if (a < b){
                    k += 1;
                }
                else{
                    if (k > max_k)
                        max_k = k;
                    k = 1;
                }
                a = b;
            }
        }
        return max_k;
    }
}