package org.javapractices.lab11;

import java.io.*;
import java.util.*;

public class Task6_1and6_2{
    public static void main(String[] args) throws IOException {
        String filename4 = "file4.txt", filename5 = "file5.txt";
        FileReader fr = new FileReader(filename4);
        Scanner fsc = new Scanner(fr);
                
        FileWriter fw = new FileWriter(filename5);

        int counter = 0;
        double sum = 0, product = 1;
        System.out.println("All numbers in text file: ");
        while (fsc.hasNextDouble()) {
            double nextD = fsc.nextDouble();
            counter++;
            System.out.println(counter + ": " + nextD);
            sum += nextD;
            if (Math.abs(nextD - 0.0) > 10e-8){
                product *= nextD;
                fw.write(nextD + "\n ");
            }
        }
        fw.write("Sum: " + String.valueOf(sum));
        fw.write("Product of non zero elements: " + String.valueOf(product));
        fw.close();
    }
}
