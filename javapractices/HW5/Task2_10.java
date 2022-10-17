package org.javapractices.HW5;
import java.util.Scanner;
import java.util.Random;

public class Task2_10 {
    public static void main(String args[]) {
        int[][] a;
        a = makeMatrix();
        displayMatrix(a);
        
        int MAX = findMax(a);
        int n = a.length;
        int[][] b = new int[n][n];
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (a[i][j] == MAX)
                    b = changeMatrix(b, i, j);
                if (b[i][j] != n+1) 
                    b[i][j] = a[i][j];
            }
        }
        
        System.out.print("Changed matrix A \n");
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
            for (int j = 0; j < n; j++){
                if (mtx[i][j] != n+1)
                    System.out.printf("%4d ", mtx[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
    
    public static int findMax(int[][] m){
        int n = m.length;
        int max = -(n+1);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (m[i][j] > max)
                    max = m[i][j];
            }
        }
        return max;
    }
    
    public static int[][] changeMatrix(int[][] b, int i, int j){
        int n = b.length;
        for (int k = 0; k < n; k++){
            b[i][k] = n+1;
            b[k][j] = n+1;
        }
        return b;
    }
}