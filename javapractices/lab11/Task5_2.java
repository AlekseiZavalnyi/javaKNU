package org.javapractices.lab11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task5_2 {
    
    public static void main(String[] args){
        String filename = "file1.txt";
        try {
            FileReader fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);

            int max_line = 0;
            int counter = 0;

            while(fsc.hasNextLine()){
                String current_line = fsc.nextLine();
                if(current_line.equals("")){
                    counter += 1;
                } else {
                    if(current_line.length() > max_line){
                        max_line = current_line.length();
                    }
                }
            }
            System.out.println("Number of empty lines: " + counter); // 3
            System.out.println("The max length of a line: " + max_line); // 22
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
