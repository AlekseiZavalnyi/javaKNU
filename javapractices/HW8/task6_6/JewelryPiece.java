package org.javapractices.HW8.task6_6;

import java.util.Arrays;

public class JewelryPiece {
    public Gemstone[] gemstones;
    public int craft_price;
    int total_price;
    double weight;

    public JewelryPiece(Gemstone[] gemstones, int craft_price) {
        this.gemstones = gemstones;
        this.craft_price = craft_price;
    }

    public double setWeight() {
        double weight = 0;
        for(Gemstone gem: gemstones)
            weight+=gem.weight;
            
        this.weight = weight;
        return this.weight;
    }

    public int setPrice(){
        int price = this.craft_price;
        for(Gemstone gem: gemstones)
            price += gem.price;
        
        total_price = price;
        return total_price;
    }
    
    @Override
    public String toString() {
        return "Jewelry Piece" +
                "\ngemstones=" + Arrays.toString(gemstones) +
                "\ncraft_price=" + craft_price + "\n";
    }
}
