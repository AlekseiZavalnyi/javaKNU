package org.javapractices.lab5;
import java.util.Scanner;
import java.util.Random;

public class Task2_6 {
    public static void main(String args[]) {
        int[][] a;
        a = makeMatrix();
        displayMatrix(a);
        findNorm(a);
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
    
    public static void findNorm(int[][] m){
        int Knorm = 0;
        int max_sumM = 0, max_sumL = 0;
        for (int i = 0; i < m.length; i++){
            int sumM = 0, sumL = 0;
            for (int j = 0; j < m.length; j++){
                sumM += Math.abs(m[i][j]);
                sumL += Math.abs(m[j][i]);
                Knorm += Math.pow(m[i][j], 2);
            }
            if (sumM > max_sumM)
                max_sumM = sumM;
                
            if (sumL > max_sumL)
                max_sumL = sumL;
        }
        System.out.printf("M норма: %d \n", max_sumM);
        System.out.printf("L норма: %d \n", max_sumL);
        System.out.printf("K норма: %.3f \n", Math.sqrt(Knorm));
        
    }
}