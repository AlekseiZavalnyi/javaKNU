package org.javapractices.HW8.task6_6;

public class Gemstone implements Comparable<Gemstone>{
    public double weight;
    public int rarity;
    public int price;
    public double transparency;

    public Gemstone(double weight, int rarity, int price, double transparency) {
        this.weight = weight;
        this.rarity = rarity;
        this.price = price;
        this.transparency = transparency;
    }
    
    public double getWeight() { return weight; }
    
    public int getRarity() { return rarity; }
    
    public int getPrice() { return price; }
    
    public double getTransparency() { return transparency; }
    
    public void setWeight(double weight) { this.weight = weight; }
    
    public void setRarity(int rarity) { this.rarity = rarity; }
    
    public void setPrice(int price) { this.price = price; }
    
    public void setTransparency(double transparency) { this.transparency = transparency; }
    
    @Override
    public int compareTo(Gemstone gemstone) { return this.rarity - gemstone.rarity; }

    @Override
    public String toString() {
        return "Gemstone" +
                "\nweight: " + weight +
                "\nrarity: " + rarity +
                "\nprice: " + price +
                "\ntransparency: " + transparency + "\n";
    }
}
