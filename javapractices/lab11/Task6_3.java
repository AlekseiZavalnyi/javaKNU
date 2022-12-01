package org.javapractices.lab11;

import java.io.*;
import java.util.*;

public class Task6_3{
    public static void main(String[] args) throws IOException {
        String filename1 = "file4.txt", filename2 = "file6.txt";
        FileReader fr = new FileReader(filename1);
        Scanner fsc = new Scanner(fr);
                
        FileWriter fw = new FileWriter(filename2);

        int counter = 1;
        double product = 1;
        System.out.println("All numbers in text file: ");
        while (fsc.hasNextDouble()) {
            double nextD = fsc.nextDouble();
            System.out.println(counter + ": " + nextD);
            if (counter % 2 == 0){
                if (Math.abs(nextD - 0.0) > 10e-8){
                    product *= nextD;
                    fw.write(String.valueOf(nextD) + "\n ");
                }
            }
            counter++;
        }
        fw.write("Product of non zero even elements: " + String.valueOf(product));
        fw.close();
    }
}
