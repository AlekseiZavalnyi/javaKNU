package org.javapractices.HW8.task6_6;

import java.util.Arrays;

public class Task6_6 {
    public static void main(String[] args){
        Gemstone[] gems = new Gemstone[]{ new Diamond(0.1, 1, 100, 0.4, "Blue", "A"),
                                          new Diamond(0.5, 2, 1000, 0.7, "Green", "B"),
                                          new Ruby(0.1, 3, 70, 0.55, "A"),
                                          new Ruby(0.15, 5, 60, 0.66, "C")};

        JewelryPiece j = new JewelryPiece(gems, 1000);

        System.out.println("\nSorted: ");
        Arrays.sort(gems);
        for(Gemstone gem: gems)
            System.out.println(gem);
        System.out.println("\n");

        double l=0.12, r=0.61;

        System.out.printf("\n %.2f <= transparency <= %.2f: ", l, r);
        for(Gemstone gem: gems){
            if((l <= gem.getTransparency()) && (gem.getTransparency() <= r))
                System.out.print(gem);
        }
    }
}
