package org.javapractices.lab11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "file1.txt";

        FileReader fr = new FileReader(filename);
        Scanner fsc = new Scanner(fr);
        String line;
        
        System.out.println("Part A: ");
        while(fsc.hasNextLine()) {
            line = fsc.nextLine();
            System.out.println(line);
        }
        /*
        System.out.println("\nPart B: ");
        boolean flag = true;
        while(fsc.hasNextLine()) {
            line = fsc.nextLine();
            if(line.length() > 60){
                System.out.println(line);
                flag = false;
            }
        }
        if (flag){
            System.out.println("There are no lines in the file with more than 60 characters");
        }
        

        System.out.println("\nPart C&D: ");
        int counter1 = 0, counter2 = 0;
        String symbol = "a";
        while(fsc.hasNextLine()){
            line = fsc.nextLine();
            if(line.startsWith(symbol)){
                //System.out.println(line);
                counter1 += 1;
            }
            
            if(line.endsWith(symbol)){
                //System.out.println(line);
                counter2 += 1;
            }
        }
        System.out.println("There are " + counter1 + " lines that begins with " + symbol);
        System.out.println("There are " + counter2 + " lines that ends with " + symbol);
        
        
        System.out.println("\nPart E: ");
        int counter3 = 0;
        while(fsc.hasNextLine()) {
            line = fsc.nextLine();
            if(!line.isEmpty()){
                if(line.charAt(0) == line.charAt(line.length() - 1)){
                    System.out.println(line);
                    counter3 += 1;
                }
            }
        }
        System.out.println("There are " + counter3 + " lines that begin and ends with same symbol");

        int counter4 = 0;
        while(fsc.hasNextLine()) {
            line = fsc.nextLine();
            if(!line.isEmpty()){
                boolean equal = true;
                for (int i = 0; i < line.length(); i++ ){
                    if (line.charAt(0) != line.charAt(i)){
                        equal = false;
                    }
                }
                if (equal){
                    System.out.println(line);
                    counter4 += 1;
                }
            }
        }
        System.out.println("There are " + counter4 + " lines with equals symbols");
        */
    }
}
