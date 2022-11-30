package org.javapractices.HW11;

import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.FileReader;
import java.util.*;

public class Task5_12 {
    public static void main(String[] args) throws FileNotFoundException{
        String model = "Ford", num = "1111", owner = "A";
        String[] models = new String[256];
        try{
            String filename = "hwfile1.txt";
            FileReader fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            String line;
            int i = 0;
            while(fsc.hasNextLine()){
                line = fsc.nextLine();
                String[] data = line.split(" ");
                models[i] = data[0];
                if (data[0].equals(model)){
                    System.out.println("Model " + model + ", owner: " + owner);
                }
                i++;
            }
            List<String> sampleList=(List<String>) Arrays.asList(models);
            for(String m: models){
                int frequency = Collections.frequency(sampleList,m);
                System.out.println(m + " " + frequency);
            }

            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
