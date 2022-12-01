package org.javapractices.HW11;
import java.util.*;
import java.io.*;

public class Task6_7 {
    public static void main(String[] args) throws FileNotFoundException{
        String filename = "hwfile2.txt";
        FileReader fr = new FileReader(filename);
        Scanner fsc = new Scanner(fr);
                
        double max_area = -1.0, area;
        while (fsc.hasNextLine()) {
            String str_num = fsc.nextLine();
            String[] arr_str = str_num.split(" ");
            double[] coords = Arrays.stream(arr_str)
                        .mapToDouble(Double::parseDouble).toArray();
            area = Math.sqrt(Math.pow(coords[0] - coords[2], 2) + Math.pow(coords[1] - coords[3], 2));
            if (area > max_area){
                max_area = area;
            }
        }  
        System.out.println("Rectangle with the largest area: " + max_area);
    }
}
