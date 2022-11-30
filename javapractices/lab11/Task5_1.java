package org.javapractices.lab11;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args){
        String filename1 = "file1.txt";
        String filename2 = "file2.txt";
        String filename3 = "file3.txt";
        System.out.println(partA(filename1));
        System.out.println(partB(filename1));
        partC(filename1, filename2);
        partD(filename1, filename3);
    }
    
    
    public String partA(String filename) throws FileNotFoundException{
        String longest_word = "";
        try{
            FileReader fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            while (fsc.hasNextLine()){
                String str = fsc.nextLine();
                String[] words = str.split("\\s+");

                for(String current_word: words){
                    if(current_word.length() > longest_word.length())
                        longest_word = current_word;
                }
            }
        } catch (FileNotFoundException e) { throw new RuntimeException(e); }
        return longest_word; 
    }
    
    public int partB(String filename) throws FileNotFoundException{
        int counter = 0;
        try{
            FileReader fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            while (fsc.hasNextLine()){
                String str = fsc.nextLine();
                String[] words = str.split("\\s+");
                for(String current_word: words){
                    counter++;
                }
            }
        } catch (FileNotFoundException e) { throw new RuntimeException(e); }
        return counter;
    }
    
    public void partC(String filename1, String filename2) throws IOException{
        FileReader fr = new FileReader(filename1);
        FileWriter fw = new FileWriter(filename2);
        Scanner fsc = new Scanner(fr);
        try{
            while(fsc.hasNextLine()){
                String line = fsc.nextLine().replaceAll("\\b[\\w']{1}\\b", "").trim();
                line = line.replaceAll("\\s+", " ");
                fw.write(line);
            }
        } catch (IOException e) { throw new RuntimeException(e); }
    }
    
    public void partD(String filename1, String filename2) throws IOException{
        FileReader fr = new FileReader(filename1);
        FileWriter fw = new FileWriter(filename2);
        Scanner fsc = new Scanner(fr);
        try{
            while(fsc.hasNextLine()){
            String line = fsc.nextLine().replaceAll("\\s+", " ").trim();
            line = line.replaceAll("\\s+", "");
            fw.write(line);
            }
        } catch (IOException e) { throw new RuntimeException(e); }
    }

}
